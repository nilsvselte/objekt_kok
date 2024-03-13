package uke7.folder;

import java.util.function.Predicate;

public class FileNamePredicate  implements Predicate<File>{

    String name;

    public FileNamePredicate(String name) {
        this.name = name;
    }

    @Override
    public boolean test(File other) {
        return this.name.equals(other.name);
    }
}
