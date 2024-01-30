package JavaOOPS.TypeCast;

public class TestTypeCast {
    public static void main(String[] args) {
        String s = new String("hello");
        Object o = (Object) s;
        boolean flag = s == o;
        System.out.println("Referring to same object "+flag);
        System.out.println(o.hashCode()+" "+s.hashCode());

        Integer i = new Integer(10);
        Number n = (Number) i;
        Object o1 = (Object) n;
        System.out.println(o1.hashCode()+" "+n.hashCode()+" "+i.hashCode());
    }
}
