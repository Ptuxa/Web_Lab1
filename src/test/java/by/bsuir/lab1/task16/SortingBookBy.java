package by.bsuir.lab1.task16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SortingBookBy {
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
    void compareBooksByTitle() {
        List<Book> listBooksActual= new ArrayList<>(List.of(
                new Book("title3", "author2", 18),
                new Book("title2", "author1", 13),
                new Book("title1", "author3", 19)
        ));

        List<Book> listBooksExpected = new ArrayList<>(List.of(
                new Book("title1", "author3", 19),
                new Book("title2", "author1", 13),
                new Book("title3", "author2", 18)
        ));

        SortBook.sortingByTitle(listBooksActual);
        Assertions.assertEquals(listBooksActual, listBooksExpected);
    }

    @Test
    void compareBooksByTitleAndAuthor() {
        List<Book> listBooksActual= new ArrayList<>(List.of(
                new Book("title3", "author2", 18),
                new Book("title1", "author3", 13),
                new Book("title1", "author1", 19)
        ));

        List<Book> listBooksExpected = new ArrayList<>(List.of(
                new Book("title1", "author1", 19),
                new Book("title1", "author3", 13),
                new Book("title3", "author2", 18)
        ));

        SortBook.sortingByTitleAndAuthor(listBooksActual);
        Assertions.assertEquals(listBooksActual, listBooksExpected);
    }

    @Test
    void compareBooksByAuthorAndTitle() {
        List<Book> listBooksActual= new ArrayList<>(List.of(
                new Book("title3", "author3", 18),
                new Book("title2", "author1", 13),
                new Book("title1", "author1", 19)
        ));

        List<Book> listBooksExpected = new ArrayList<>(List.of(
                new Book("title1", "author1", 19),
                new Book("title2", "author1", 13),
                new Book("title3", "author3", 18)
        ));

        SortBook.sortingByAuthorAndTitle(listBooksActual);
        Assertions.assertEquals(listBooksActual, listBooksExpected);
    }

    @Test
    void compareBooksByAuthorAndTitleAndPrice() {
        List<Book> listBooksActual= new ArrayList<>(List.of(
                new Book("title3", "author3", 18),
                new Book("title2", "author1", 13),
                new Book("title1", "author1", 19),
                new Book("title1", "author1", 18)
        ));

        List<Book> listBooksExpected = new ArrayList<>(List.of(
                new Book("title1", "author1", 18),
                new Book("title1", "author1", 19),
                new Book("title2", "author1", 13),
                new Book("title3", "author3", 18)
        ));

        SortBook.sortingByAuthorAndTitleAndPrice(listBooksActual);
        Assertions.assertEquals(listBooksActual, listBooksExpected);
    }





}
