package lab;

public abstract class AlignLeft implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Aligned to the left: " + paragraph.get());
    }
}