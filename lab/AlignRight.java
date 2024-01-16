package lab;

public abstract class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Aligned to the right: " + paragraph.get());
    }
}