package Interface;

interface Calc {

    double PI = 3.14159;

    double add(double a, double b);
    double sub(double a, double b);

}

class MyCalc implements Calc {


    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a -b;
    }

    public double sin(double deg) {
        double radians = deg * PI / 180;
        return Math.sin(radians);
    }
}

public class Main {

    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
    }

}
