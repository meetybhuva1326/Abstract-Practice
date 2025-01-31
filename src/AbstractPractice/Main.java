package AbstractPractice;

public class Main {

    static void drawUtil(int x1, int x2, int y1, int y2, Graphic g) {
        g.setStart(x1, y1);
        g.setEnd(x2, y2);
        g.draw();
    }

    public static void main(String[] args) {

        drawUtil(30,30,40,40, new Line());
        drawUtil(50,50,60,60, new Rectangle());

    }
}
