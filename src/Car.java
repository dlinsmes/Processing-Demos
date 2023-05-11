import processing.core.PApplet;

//object class doesn't need to extend PApplet,
// but needs a PApplet instance variable
public class Car {

    PApplet p; //important
    float x;
    float y;
    float w;
    float h;
    float speed;
    int r;
    int g;
    int b;

    //one param needs to be PApplet
    public Car(float x, float y, float w, float h, float speed, PApplet p) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.speed = speed;
        r = (int)(Math.random()*256);
        g = (int)(Math.random()*256);
        b = (int)(Math.random()*256);

        this.p = p; //important
    }

    public void move(){
        x += speed;
        //use system variable width from Processing window
        if (x >= p.width) {
            x = -w;
        }
        else if (x+w <= 0) {
            x = p.width;
        }
    }

    public void display() {
        //draw shapes on processing window
        p.fill(r, g, b);
        p.rect(x, y, w, h);

        p.fill(0);
        //look up Processing documentation for ellipse
        p.ellipse((x+(w/5)), y, (w/4), (h/4));
        p.ellipse((x+(4*w/5)), y, (w/4), (h/4));
        p.ellipse((x+(w/5)), y+h, (w/4), (h/4));
        p.ellipse((x+(4*w/5)), y+h, (w/4), (h/4));

        //can also load an image to display
    }



}
