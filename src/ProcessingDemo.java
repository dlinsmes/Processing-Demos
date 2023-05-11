import processing.core.PApplet;

public class ProcessingDemo extends PApplet{

    public static void main(String [] args) {
        PApplet.main("ProcessingDemo");
    }

    public void settings() {
        size(600, 600);
    }

    float x;
    float y;

    float xVel;
    float yVel;

    float r = random(0, 255);
    float g = random(0, 255);
    float b = random(0, 255);

    //runs once at the start of program
    public void setup() {
        //width and height are system variables for window
        //dimensions
        //-use to initialize x and y
        x = width/2;
        y = height/2;

        //random() - args are min and max
        xVel = random(1, 5);
        yVel = random(1, 5);

        //coin flip to make negative
        if (random(1, 2) > 1.5)
            xVel *= -1;
        if (random(1, 2) > 1.5)
            yVel *= -1;
    }

    //runs continuously in a loop after setup()
    public void draw() {

        //redraw background in draw() to cover up "trails"
        //background args are 3 values for rgb or 1 value for gray
        background(r, g, b);

        //fill() placed before the shape will change the color of shape
        fill(b, r, g);
        //x increases from left to right
        //y increases from top to bottom
        circle(x, y, 50);

        x += xVel;
        y += yVel;

        //detect when ball hits top edge to make it bounce
        if (y - 25 < 0) {
            yVel *= -1;
        }

        if (y + 25> height)
            yVel *= -1.1;

        if (x + 25 > width || x - 25 < 0)
            xVel *= -1.1;

    }

}
