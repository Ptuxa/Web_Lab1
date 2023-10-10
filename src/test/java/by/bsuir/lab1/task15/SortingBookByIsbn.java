package by.bsuir.lab1.task15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingBookByIsbn {
    @Test
    void takeHashIdenticalClasses() {
        Book firstBook = new Book("title", "author", 1,3);
        Book secondBook = new Book("title", "author", 1, 3);
        Assertions.assertEquals(firstBook.hashCode(), secondBook.hashCode());
    }

    @Test
    void takeEqualsIdenticalClasses() {
        Book firstBook = new Book("title", "author", 1, 3);
        Book secondBook = new Book("title", "author", 1, 3);
        Assertions.assertEquals(firstBook, secondBook);
    }

    @Test
    void takeHashNotIdenticalClasses() {
        Book firstBook = new Book("title1", "author1", 1, 3);
        Book secondBook = new Book("title2", "author2", 1, 3);
        Assertions.assertNotEquals(firstBook.hashCode(), secondBook.hashCode());
    }

    @Test
    void takeEqualsNotIdenticalClasses() {
        Book firstBook = new Book("title1", "author1", 1, 3);
        Book secondBook = new Book("title2", "author2", 1, 3);
        Assertions.assertNotEquals(firstBook, secondBook);
    }

    @Test
    void takeToString() {
        Book book = new Book("title", "author", 1, 3);
        Assertions.assertEquals("Title = title; Author = author; Price = 1; Edition = 0; Isbn = 3", book.toString());
    }

    @Test
    void compareBooks() {
        Book bookFirst = new Book("title", "author", 1, 3);
        Book bookSecond = new Book("title", "author", 1, 2);
        Assertions.assertEquals(-1, bookSecond.compareTo(bookFirst));
    }
}
