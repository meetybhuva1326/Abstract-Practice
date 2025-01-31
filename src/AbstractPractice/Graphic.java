package AbstractPractice;

abstract class Graphic {

    protected int x1,y1;
    protected int x2,y2;

    public void setStart(int x, int y){
        x1 = x;
        y1 = y;
    }

    public void setEnd(int x, int y){
        x2 = x;
        y2 = y;
    }

    public abstract void draw();

}

class Line extends Graphic {

    @Override
    public void draw() {
        System.out.printf("draw line from (%d,%d) to (%d,%d) %n", x1,y1,x2,y2);
    }

}

class Rectangle extends Graphic {

    @Override
    public void draw() {
        System.out.printf("draw rectangle from (%d,%d) to (%d,%d) %n", x1,y1,x2,y2);
    }

}
