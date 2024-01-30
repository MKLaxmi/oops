package JavaOOPS.Chap3;

// in case of child and parent Child has high priority than parent
// object being parent string being child null can be for moth arg type but resolution happens as of child
public class TestOverloading3 {
    public void m1(Object o) {
        System.out.println("object -version ");
    }

    public void m1(String s) {
        System.out.println("String -version ");
    }

    public static void main(String[] args) {
        TestOverloading3 t = new TestOverloading3();
        t.m1(new Object());
        t.m1("hello");
        t.m1(null);
    }
}
