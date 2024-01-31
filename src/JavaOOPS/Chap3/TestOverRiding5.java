package JavaOOPS.Chap3;

// in over riding method is only applicable for METHODS
//variables resolution is always taken care by COMPILIER based on Reference TYPE called SHADOWING
class P5 {
    String s = "Parent display";
}
class C5 extends P5 {
    String s = "Child display";
}
public class TestOverRiding5 {
    public static void main(String[] args) {
        P5 p = new P5();
        System.out.println(p.s);
        C5 c = new C5();
        System.out.println(c.s);
        P5 pc = new C5();
        System.out.println(pc.s);
    }
}
