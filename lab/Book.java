package lab;

import java.util.ArrayList;
import java.util.List;
import lab.Author;
class Book {
    private final String title;
    private final List<Author> author;
    private  TableOfContent tableOfContents;
    private final List<Chapter> chapters;

    public Book(String title, Author author) {
        this.title = title;
        this.author = new ArrayList<>();
        this.tableOfContents = tableOfContents;
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter){
        chapters.add(chapter);
    }
    public void print() {
        System.out.println("lab.Book Title: " + title);
        for (Author a : author) {
            a.print();
        }
    }
}