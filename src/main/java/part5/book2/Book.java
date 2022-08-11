package part5.book2;

public class Book {
    
    private String author;
    private String name;
    private int pages;
    
    @Override
    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
    
    String getAuthor() {
        return author;
    }
    
    void setAuthor(final String author) {
        this.author = author;
    }
    
    String getName() {
        return name;
    }
    
    void setName(final String name) {
        this.name = name;
    }
    
    int getPages() {
        return pages;
    }
    
    void setPages(final int pages) {
        this.pages = pages;
    }
    
    Book(final String author, final String name, final int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }
}
