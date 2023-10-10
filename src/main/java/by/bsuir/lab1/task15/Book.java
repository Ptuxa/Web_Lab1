package by.bsuir.lab1.task15;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition = 0;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        return (31 * title.hashCode() + 47 * author.hashCode() + Integer.valueOf(price).hashCode() * 311) % 9907;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (null == object) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return  false;
        }
        Book book = (Book) object;
        if (price != book.price) {
            return false;
        }
        if (null == title){
            if (title != book.title) {
                return false;
            }
        }
        else {
            if (!title.equals(book.title)) {
                return false;
            }
        }
        if (null == author){
            return (author == book.author);
        }
        else {
            if (!author.equals(book.author)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "Title = " + title + "; Author = " + author + "; Price = " + price + "; Edition = " + edition + "; Isbn = " + isbn;
    }

    @Override
    public int compareTo(Book object) {
        return this.isbn - object.isbn;
    }
}
