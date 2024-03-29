package JavaOOPS.Chap3;

// in over riding method resolution is performed by JVM during run time based on run time object
class P {
    public void display() {
        System.out.println("Parent display");
    }

}
class C extends P {
    public void display() {
        System.out.println("Child display");
    }

}

public class TestOverRiding1 {
    public static void main(String[] args) {
        //run time obj is of class P
        P p = new P();
        p.display();
        //run time obj is of class C
        C c = new C();
        c.display();
        //run time obj is of class C
        P pc = new C();
        pc.display();
    }
}
