package lab;

public abstract class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Aligned to the center: " + paragraph.get());
    }

}