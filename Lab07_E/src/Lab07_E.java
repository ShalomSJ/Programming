class C {
    public void Inheritance(){
        System.out.println("Demonstration of Hybrid Inheritance:");
    }
    public void Print() {
        System.out.println("C is the Parent Class to all A,B,Lab08_C");
    }
}
class A extends C {
    public void Print() {
        System.out.println("A has Single Inheritance with C and shares Hierarchy with B");
    }
}
class B extends C {
    public void Print() {
        System.out.println("B has Single Inheritance with C and shares Hierarchy with A");
    }
}
class D extends A {
    public void Print() {
        System.out.println("Lab08_C has Single Inheritance with A and Multi-Level inheritance with C");
    }
}

public class Lab07_E{
    public static void main(String[] args) {
        A w = new A();
        B x = new B();
        C y = new C();
        D z = new D();
        y.Inheritance();
        y.Print();
        w.Print();
        x.Print();
        z.Print();

    }
}

