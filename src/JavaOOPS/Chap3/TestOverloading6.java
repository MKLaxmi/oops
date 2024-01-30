package JavaOOPS.Chap3;

// in case of child and parent Child has high priority than parent
// As int can be promoted to float at both methods get ce reference to m1 is ambiguous
public class TestOverloading6 {
    public void m1(int i, float f) {
        System.out.println("int-float -version ");
    }

    public void m1(float f, int i) {
        System.out.println("float-int -version ");
    }

    public static void main(String[] args) {
        TestOverloading6 t = new TestOverloading6();
        t.m1(10, 10.2f);
        t.m1(10.2f, 10);
        //ce reference to m1 is ambiguous
//        t.m1(10,10);
        //no sutiable method matched
//        t.m1(10.2f,10.2f);
    }
}
