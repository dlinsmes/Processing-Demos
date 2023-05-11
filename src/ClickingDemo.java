import processing.core.PApplet;
public class ClickingDemo extends PApplet{

    public static void main(String [] args) {
        PApplet.main("ClickingDemo");
    }
    public void settings() {
        size(500, 500);
    }

    int r = 0;

    public void draw() {
        fill(r, 0, 0);
        rect(100, 200, 30, 40);
    }

    public void mousePressed(){
        if (mouseX >= 100 && mouseX <= 100+30 && mouseY >= 200 && mouseY <= 200+40) {

            if (r == 0)
                r = 255;
            else
                r = 0;
        }
    }
}
