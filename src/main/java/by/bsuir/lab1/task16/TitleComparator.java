package by.bsuir.lab1.task16;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookFirst, Book bookSecond) {
        return bookFirst.getTitle().compareTo(bookSecond.getTitle());
    }
}
