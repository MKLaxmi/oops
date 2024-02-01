package JavaOOPS.Chap3;

public class ObjectTypeCastInternal {
    public static void main(String[] args) {
        String s = new String("hi");
        Object o = (Object) s;
        System.out.println("both referring to same obj "+s.hashCode()+" == "+o.hashCode());
        System.out.println(s == o);
// eg 2
        Integer i = new Integer(10);
        Number n = (Number)i;
        Object oo = (Object) n;
        System.out.println("All referring to same obj "+i.hashCode()+" == "+n.hashCode()+" == "+oo.hashCode());
        System.out.println(i == oo);
    }
}

