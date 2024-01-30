package JavaOOPS.TypeCast;
//variable resolution always taken care by compilier
class A2{
    int x= 999;
}
class B2 extends A2{
  int x= 888;
}
class C2 extends B2{
 int x = 777;
}

public class TestTypeCastEg4 {
    public static void main(String[] args) {
        C2 cc = new C2();
        System.out.println(cc.x);
        System.out.println(((B2)cc).x);
        System.out.println(((A2)((B2)cc)).x);
    }
}
