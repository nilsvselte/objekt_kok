package of1.lf;

public class Book {

    String title;
    int pages;

    Book(String title, int pages) {
        this.setTitle(title);
        this.setPages(pages);
    }

    String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    int getPages() {
        return this.pages;
    } 

    void setPages(int pages) {
        if (pages <= 0) {
            this.pages = 0;
        } else {
            this.pages = pages;
        }
    }

    @Override
    public String toString() {
        return "Book(Title: \"" + this.getTitle() + "\", pages: " + this.getPages() + ")"; 
    }

    public static void main(String[] args) {
        Book book1 = new Book("Big Java", 100);
        Book book2 = new Book("Intro to algorithms",700);

        System.out.println("The book \"" + book1.getTitle() + "\" has " + book1.getPages() + " pages");
        System.out.println("The book \"" + book2.getTitle() + "\" has " + book2.getPages() + " pages");
    
        book1.setTitle("Another Book");
        book1.setPages(250);
        System.out.println("The book \"" + book1.getTitle() + "\" has " + book1.getPages() + " pages");
    
        System.out.println("My book: " + book1);
    }
}
