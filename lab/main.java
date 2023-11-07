package lab;

public class main {
    public static void main(String[] args) {

        Author author = new Author("Example name");
        Book book = new Book("Sample lab.Book", author);
        TableOfContent toc = new TableOfContent();
        Chapter chapter = new Chapter("lab.Chapter 1");
        SubChapter subChapter = new SubChapter("lab.SubChapter 1");
        Image image = new Image("lab.Image 1");
        Paragraph paragraph = new Paragraph("This is a paragraph.");
        Table table = new Table("lab.Table 1");

        book.print();
        toc.print();
        chapter.print();
        subChapter.print();
        image.print();
        paragraph.print();
        table.print();
    }
}