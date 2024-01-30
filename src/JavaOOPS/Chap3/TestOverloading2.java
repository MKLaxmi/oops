package JavaOOPS.Chap3;

public class TestOverloading2 {
    public void m1(int i) {
        System.out.println("int -ags ");
    }

    public void m1(float i) {
        System.out.println("float -ags ");
    }

    public static void main(String[] args) {
        TestOverloading2 t = new TestOverloading2();
        t.m1(10);
        t.m1(10.2f);
        t.m1('a');
        t.m1(10l);
        //promotion is allowed not demotion in overloading so error called as AUTOMATIC PROMOTION
//        t.m1();
//        t.m1(10.5);
    }
}
