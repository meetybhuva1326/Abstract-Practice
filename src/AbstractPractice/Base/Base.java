package AbstractPractice.Base;

abstract class Base {

    public abstract void f();
    public abstract void g();

    public void h(){
        System.out.println("h() in Base");
    }

}

abstract class Derived extends Base {
    public void f(){
        System.out.println("f() in Derived");
    }
}

class Derived1 extends Derived {
    public void g(){
        System.out.println("g() in Derived");
    }
}