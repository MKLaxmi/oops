package JavaOOPS.Chap3;

// in case of child and parent Child has high priority than parent
// object being parent string and string buffer so compiler can't resolve for null argument
public class TestOverloading4 {
    public void m1(String s) {
        System.out.println("string -version ");
    }

    public void m1(StringBuffer sb) {
        System.out.println("StringBuffer -version ");
    }

    public static void main(String[] args) {
        TestOverloading4 t = new TestOverloading4();
        t.m1(new StringBuffer("hello"));
        t.m1("hello");
//        t.m1(null);
    }
}
