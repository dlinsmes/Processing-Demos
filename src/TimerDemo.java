import processing.core.PApplet;

public class TimerDemo extends PApplet{
    public static void main(String [] args) {
        PApplet.main("TimerDemo");
    }

    public void settings() {
        size(500, 500);
    }

    int prevTime = 0;
    int count = 0;

    public void draw() {
        //-millis() counts milliseconds passed since the start of the program
        //-every time you call the function, millis() will give a different value
        //-change count every 1000 milliseconds (one second)
        if (millis() - prevTime >= 1000) {
            count++;
            prevTime = millis();
        }

        if (count < 5) {
            background(0);

            //text color, size, value, and position
            fill(255);
            textSize(30);
            text(5 - count, 250, 250);
        }
        else  {
            background(255,0, 0);

            //text color, size, value, and position
            fill(255);
            textSize(50);
            text("[insert explosion here]", 20, 250);
        }



    }
}
