package part4.books20;

public class Book {
    
    private String title;
    private int pages;
    private int publicationYear;
    
    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
    
    Book(final String title, final int pages, final int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    String getTitle() {
        return title;
    }
    
    void setTitle(final String title) {
        this.title = title;
    }
    
    int getPages() {
        return pages;
    }
    
    void setPages(final int pages) {
        this.pages = pages;
    }
    
    int getPublicationYear() {
        return publicationYear;
    }
    
    void setPublicationYear(final int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
