package lab;

public class Paragraph {
    private final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("lab.Paragraph: " + text);
    }
}
