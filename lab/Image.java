package lab;

public class Image {
    private final String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("lab.Image: " + imageName);
    }
}
