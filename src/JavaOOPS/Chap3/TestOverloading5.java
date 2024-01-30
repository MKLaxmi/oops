package JavaOOPS.Chap3;
// in case of child and parent Child has high priority than parent
// Var arg always have least priority
public class TestOverloading5 {
    public void m1(int i){
        System.out.println("General -version ");
    }
    public void m1(int ... i){
        System.out.println("var-args -version ");
    }
    public static void main(String[] args) {
        TestOverloading5 t = new TestOverloading5();
        t.m1();
        t.m1(10);
//        t.m1(null);
    }
}
