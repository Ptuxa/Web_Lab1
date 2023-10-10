package by.bsuir.lab1.task13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgrammerBookEqualsAndHash {
    @Test
    void takeHashIdenticalClasses() {
        ProgrammerBook firstBook = new ProgrammerBook("title", "author", 1, "English", 2);
        ProgrammerBook secondBook = new ProgrammerBook("title", "author", 1, "English", 2);
        Assertions.assertEquals(firstBook.hashCode(), secondBook.hashCode());
    }

    @Test
    void takeEqualsIdenticalClasses() {
        ProgrammerBook firstBook = new ProgrammerBook("title", "author", 1, "English", 2);
        ProgrammerBook secondBook = new ProgrammerBook("title", "author", 1, "English", 2);
        Assertions.assertEquals(firstBook, secondBook);
    }

    @Test
    void takeHashNotIdenticalClasses() {
        ProgrammerBook firstBook = new ProgrammerBook("title", "title", 1, "English", 2);
        ProgrammerBook secondBook = new ProgrammerBook("title", "title", 1, "Spanish", 2);
        Assertions.assertNotEquals(firstBook.hashCode(), secondBook.hashCode());
    }

    @Test
    void takeEqualsNotIdenticalClasses() {
        ProgrammerBook firstBook = new ProgrammerBook("title", "title1", 1, "English", 2);
        ProgrammerBook secondBook = new ProgrammerBook("title", "title2", 1, "English", 2);
        Assertions.assertNotEquals(firstBook, secondBook);
    }

    @Test
    void takeToString() {
        ProgrammerBook firstBook = new ProgrammerBook("title", "author", 1, "English", 2);
        Assertions.assertEquals("Title = title; Author = author; Price = 1; Edition = 0; Language = English; Level = 2", firstBook.toString());
    }
}
