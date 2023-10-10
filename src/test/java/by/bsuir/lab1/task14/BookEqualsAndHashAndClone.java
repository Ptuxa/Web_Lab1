package by.bsuir.lab1.task14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookEqualsAndHashAndClone {
    @Test
    void takeHashIdenticalClasses() {
        Book firstBook = new Book("title", "author", 1);
        Book secondBook = new Book("title", "author", 1);
        Assertions.assertEquals(firstBook.hashCode(), secondBook.hashCode());
    }

    @Test
    void takeEqualsIdenticalClasses() {
        Book firstBook = new Book("title", "author", 1);
        Book secondBook = new Book("title", "author", 1);
        Assertions.assertEquals(firstBook, secondBook);
    }

    @Test
    void takeHashNotIdenticalClasses() {
        Book firstBook = new Book("title1", "author1", 1);
        Book secondBook = new Book("title2", "author2", 1);
        Assertions.assertNotEquals(firstBook.hashCode(), secondBook.hashCode());
    }

    @Test
    void takeEqualsNotIdenticalClasses() {
        Book firstBook = new Book("title1", "author1", 1);
        Book secondBook = new Book("title2", "author2", 1);
        Assertions.assertNotEquals(firstBook, secondBook);
    }

    @Test
    void takeToString() {
        Book book = new Book("title", "author", 1);
        Assertions.assertEquals("Title = title; Author = author; Price = 1; Edition = 0", book.toString());
    }

    @Test
    void compareCloneBook() {
        Book book = new Book("title", "author", 17);
        Assertions.assertEquals(book, book.clone());
    }
}
