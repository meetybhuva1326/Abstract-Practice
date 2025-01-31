package AbstractPractice.Base;

public class Main {

    public static void main(String[] args) {

        Base b;
        Derived d;
        Derived1 d1;

        b = new Derived1();
        d = new Derived1();
        d1 = new Derived1();

        b.f();
        b.g();
        b.h();

        d.f();
        d.g();
        d.h();

        d1.f();
        d1.g();
        d1.h();
    }

}
