package uke7.folder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;


public class Folder {

    String name;
    Folder parent;
    Collection<Folder> folders = new ArrayList<>();
    Collection<File> files = new ArrayList<>();

    

    public Folder(String name, Folder parent) {
        this.name = name;
        this.parent = parent;
        files = new ArrayList<>();
        if (parent != null)
            parent.addFolder(this);
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }

    public void removeFolder(Folder folder) {
        this.folders.remove(folder);
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    public String getName() {
        return name;
    }

    public Folder getParent() {
        return parent;
    }

    @Override
    public String toString() {
        String tmp = "/"+getName();
        if (this.parent != null)
            tmp = parent.toString() + tmp;
        return tmp;
    }

    Collection<Folder> getFolders() {
        return this.folders;
    }

    private boolean contains2(Folder destination) {
        System.out.println("Contains: Er i "+this);
        if (this == destination) return true;
        for (Folder folder : folders) {
            if (folder.contains(destination))
            System.out.println("Contains: Sjekker "+this+" mot "+destination);
                return true;
        }
        return false;
    }

    private boolean contains(Folder destination) {
        System.out.println("Contains2: sjekker"+this+" mot "+destination);
        if (this == destination) return true;
        if (null == destination) return false;
        else return this.contains(destination.parent);

    }

    public void move(Folder destination) {

        System.out.println("Flytte "+this+ " til "+destination);

        if (this.contains(destination))
            throw new IllegalArgumentException("Rekursiv kopiering");

        parent.removeFolder(this);
        this.parent = destination;
        parent.addFolder(this);
    }

    void printTree() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (File file : files) {
            System.out.println(file);
        }

        System.out.println(this);
        for (Folder folder : folders) {
            folder.printTree();
        }
    }

    public Object findFirst(String pattern) {
        System.out.println("findFirst: "+this);
        FileNamePredicate fnp = new FileNamePredicate(pattern);
        for (File file : files) {
            if (fnp.test(file))
                return file;
        }

        for (Folder folder : folders) {
            if (folder.getName().equals(pattern))
                return folder;
        }
        
        for (Folder folder : folders) {
            Object found = folder.findFirst(pattern);
            if (found != null)
                return found;
        }

        return null;
    }

    private void findAll(Collection<File> result, Predicate<File> pred) {
        for (File file : files) {
            if (pred.test(file))
                result.add(file);
        }
        for (Folder folder : folders) {
            folder.findAll(result, pred);
        }
    }

    public Collection<File> findAll(String pattern){
        Collection<File> tmp = new ArrayList<>();
        FileNamePredicate fnp = new FileNamePredicate(pattern);
        this.findAll(tmp, fnp);
        return tmp;
    }

    public static void main(String[] args) {
    Folder home = new Folder("home",null);
    Folder andreas = new Folder("andreas",home);
    Folder borgeh = new Folder("borgeh",home);
    Folder carsten = new Folder("carsten",home);
    Folder adiv = new Folder("adiv",andreas);
    Folder bdiv = new Folder("bdiv",borgeh);
    Folder btmp = new Folder("btmp",borgeh);
    Folder cdiv = new Folder("cdiv",carsten);

    File fil1 = new File("home.txt", home);
    fil1.move(borgeh);

    System.out.println(home.findFirst("home.txt"));
    
    File fil2 = new File("fil.txt", home);
    File fil3 = new File("fil.txt", adiv);
    System.out.println(home.findAll("fil.txt"));
    }

}
