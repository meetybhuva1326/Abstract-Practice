package Polymorphism;

public class Main {

    public static void main(String[] args) {

        Sample s = new Sample();
        s.print(10);
        s.print(10.2);
        s.print("Abc");

    }

}

class Sample {

    public void print(int a){
        System.out.println("int value - " + a);
    }


    public void print(double a){
        System.out.println("double value - " + a);
    }


    public void print(String a){
        System.out.println("String value - " + a);
    }

}
