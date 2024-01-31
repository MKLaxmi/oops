package JavaOOPS.Chap3;

// in over riding method resolution is performed by JVM during run time based on run time object
//overriding static methods is called as METHOD HIDING - here method resolution is taken care by Compiler based on reference type
class P4 {
    public static void display() {
        System.out.println("Parent display");
    }

}
class C4 extends P4 {
    public static  void display() {
        System.out.println("Child display");
    }

}

public class TestOverRiding4 {
    public static void main(String[] args) {
        //run time obj is of class P
        P4 p = new P4();
        p.display();
        //run time obj is of class C
        C4 c = new C4();
        c.display();
        //run time obj is of class C
        P4 pc = new C4();
        pc.display();
    }
}
