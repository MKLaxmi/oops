package JavaOOPS.Chap3;

// in over riding method resolution is performed by JVM during run time based on run time object

// Child class return type need not be same as Parent type but also its child(Parent return type) is called co varient return type
class P1 {
    public Object display() {
        System.out.println("Parent display");
        return null;
    }

}

class C1 extends P1 {
    public String display() {
        System.out.println("Child display");
        return null;
    }

}

public class TestOverRiding2 {
    public static void main(String[] args) {
        //run time obj is of class P
        P1 p = new P1();
        p.display();
        //run time obj is of class C
        C1 c = new C1();
        c.display();
        //run time obj is of class C
        P1 pc = new C1();
        pc.display();
    }
}
