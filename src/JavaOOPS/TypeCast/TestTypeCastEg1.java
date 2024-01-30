package JavaOOPS.TypeCast;

class p{
void m1(){

}
}
class C extends p{
    void m2(){}
}
public class TestTypeCastEg1 {
    public static void main(String[] args) {
C c = new C();
c.m1();
c.m2();
        ((p)c).m1();
//        ((p)c).m2();//can't access
    }


}
