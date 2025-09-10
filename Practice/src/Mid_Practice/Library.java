package Mid_Practice;

class Book{

    private String title;
    private String author;
    private String status;
    public Book(String title, String author, String status)
    {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return title + " by " + author + " [" + status + "]";
    }
}

public class Library{
    public static void main (String[] args) {
        Book[][] shelf = new Book[2][];
        shelf[0] = new Book[2];
        shelf[1] = new Book[4];

        int counter = 0;
        for (int r = 0; r < shelf.length; r++) {
            for (int c = 0; c < shelf[r].length; c++, counter++) {
                String title = "Book" + counter;
                String author = "Author" + counter;
                shelf[r][c] = new Book(title, author, "Available");
            }
        }
        for (Book[] shelves: shelf) {
            for (Book book: shelves) {
                System.out.println(book.toString());
            }
        }
    }
}
