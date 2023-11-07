package lab;

class SubChapter {
    private final String name;
    private Image image;
    private Paragraph paragraph;
    private Table table;

    public SubChapter(String name) {
        this.name = name;
        this.image = image;
        this.paragraph = paragraph;
        this.table = table;
    }

    public void print() {
        System.out.println("lab.SubChapter: " + name);
    }
}