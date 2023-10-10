package by.bsuir.lab1.task16;

import java.util.Comparator;
import java.util.List;

public class SortBook {
    public static void sortingByTitle(List<Book> listBooks) {
        Comparator<Book> comparator = new TitleComparator();
        listBooks.sort(comparator);
    }

    public static void sortingByTitleAndAuthor(List<Book> listBooks) {
        Comparator<Book> comparator = new TitleComparator().thenComparing(new AuthorComparator());
        listBooks.sort(comparator);
    }

    public static void sortingByAuthorAndTitle(List<Book> listBooks) {
        Comparator<Book> comparator = new AuthorComparator().thenComparing(new TitleComparator());
        listBooks.sort(comparator);
    }

    public static void sortingByAuthorAndTitleAndPrice(List<Book> listBooks) {
        Comparator<Book> comparator = new AuthorComparator().thenComparing(new TitleComparator()).thenComparing(new PriceComparator());
        listBooks.sort(comparator);
    }
}
