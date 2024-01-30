package JavaOOPS.Chap3;

// in case of Overloading Method resolution i s always taken care by compiler ebased on Reference type
//line 19 has ref of type animal so animal arg method resolution is executed
class Animal {
}

class Monkey extends Animal {
}

public class TestOverloading7 {
    public void m1(Animal a) {
        System.out.println("Animal -version ");
    }

    public void m1(Monkey m) {
        System.out.println("Monkey -version ");
    }

    public static void main(String[] args) {
        TestOverloading7 t = new TestOverloading7();
        Animal a = new Animal();
        t.m1(a);
        Monkey m = new Monkey();
        t.m1(m);
        // reference type is Animal so it is method resolved to animal
        Animal am = new Monkey();
        t.m1(am);

    }
}
