package JavaOOPS.TypeCast;
class A1{
    public static void m1(){
        System.out.println("A");
    }

}
class B1 extends A1{
    public static void m1(){
        System.out.println("B");
    }

}
class D1 extends B1{
    public static void m1(){
        System.out.println("C");
    }

}

public class TestTypeCastEg3 {
    public static void main(String[] args) {
        D1 cc = new D1();
        cc.m1();
        ((B1)cc).m1();
        ((A1)((B1)cc)).m1();
    }
}
