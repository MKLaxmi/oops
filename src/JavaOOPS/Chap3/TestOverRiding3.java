package JavaOOPS.Chap3;

// in over riding method resolution is performed by JVM during run time based on run time object

// while overriding we can't reduce scope of access modifier but we can increase as shown below
class PP {
//    public void display() {
    protected void display() {
        System.out.println("Parent display");
    }

}

class CC extends PP {
    //c.e:   attempting to assign weaker access privileges; was public
    // protected void display() {
    public void display() {
        System.out.println("Child display");
    }

}

public class TestOverRiding3 {
    public static void main(String[] args) {
        //run time obj is of class P
        PP p = new PP();
        p.display();
        //run time obj is of class C
        CC c = new CC();
        c.display();
        //run time obj is of class C
        PP pc = new CC();
        pc.display();
    }
}
