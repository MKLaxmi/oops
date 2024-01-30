package JavaOOPS.Chap3;

public class TestOverloading1 {
    public void m1() {
        System.out.println("no -ags ");
    }

    public void m1(int i) {
        System.out.println("int -ags ");
    }

    public void m1(double i) {
        System.out.println("double -ags ");
    }

    public static void main(String[] args) {
        TestOverloading1 t = new TestOverloading1();
        t.m1();
        t.m1(10);
        t.m1(10.2);
    }
}
