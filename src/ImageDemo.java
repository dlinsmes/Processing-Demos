import processing.core.PApplet;
import processing.core.PImage;

public class ImageDemo extends PApplet{

    public static void main(String [] args) {
        PApplet.main("ImageDemo");
    }

    PImage im;

    public void settings() {
        size(500, 500);
    }

    public void setup () {
        //drag image file to project folder (not in src)
        im = loadImage("potato.jpg");

        //look up PImage documentation for options to resize
        im.resize(200, 0);
    }

    public void draw() {
        image(im, 50, 50);
    }

}
