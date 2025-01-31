package Binding;

class Base {

    public static void f(){
        System.out.println("f() in Base");
    }

    public final void g(){
        System.out.println("g() in Base");
    }


    public void h(){
        System.out.println("h() in Base");
    }

}

class Derived extends Base {

    @Override
    public void h(){
        System.out.println("h() in Derived");
    }

}


class Main {

    public static void main(String[] args) {

        Base.f();
        Base b1 = new Base();
        b1.g();
        b1.h();

        Base b2 = new Derived();
        b2.g();
        b2.h();

    }

}
