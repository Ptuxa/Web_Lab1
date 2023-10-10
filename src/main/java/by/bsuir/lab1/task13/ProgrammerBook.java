package by.bsuir.lab1.task13;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 19 * language.hashCode() + 29 * level;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (null == object) {
            return false;
        }
        if (!super.equals(object)) {
            return  false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) object;
        if (level != programmerBook.level) {
            return false;
        }
        if (null == language){
            return (language == programmerBook.language);
        }
        else {
            if (!language.equals(programmerBook.language)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "; Language = " + language + "; Level = " + level;
    }
}
