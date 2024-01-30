package JavaOOPS.TypeCast;
class A{
    void m1(){
        System.out.println("A");
    }

}
class B extends A{
    void m1(){
        System.out.println("B");
    }

}
class D extends B{
    void m1(){
        System.out.println("C");
    }

}
public class TestTypeCastEg2 {
    public static void main(String[] args) {
        D cc = new D();
        cc.m1();
        ((B)cc).m1();
        ((A)((B)cc)).m1();
    }
}
