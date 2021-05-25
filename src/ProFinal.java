import processing.core.PApplet;

public class ProFinal extends PApplet {
    public static final int WIDTH=640;
    public static final int HEIGHT=480;
    int x=0;
    public static void main(String[] args) {
        PApplet.main("ProFinal", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        ellipse(x,HEIGHT/5,10,10);
        ellipse(2*x,HEIGHT*2/5,10,10);
        ellipse(3*x,HEIGHT*3/5,10,10);
        ellipse(4*x,HEIGHT*4/5,10,10);
        x++;

    }
}
