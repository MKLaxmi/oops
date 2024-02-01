package JavaOOPS.Chap3;

class Base1 {
}

class Base2 {
}

class Der1 extends Base1 {
}

class Der2 extends Base1 {
}

class Der3 extends Base2 {
}

class Der4 extends Base2 {
}

public class ObjectTypeCasting {
    public static void main(String[] args) {
        Base2 b = new Der4();

        //compile check 1 : (Der4) and b - Base2 are related
        //compile check 2 : Der4 d = (Der4)b -  Der4 = (Der4) same or child
        // (Der4)b - inter runtime obj of b should be same or child of Der4 => its same
        Der4 d = (Der4) b; // valid

        //compile check 1 : (Base1) and b - Base2 are not related
//        Base1 b1 = (Base1)b;// INVALID with compile time error

        //compile check 1 : (Base2) and b - Base2 are related/same = SAME
        //compile check 2 :  Base2 b2 = (Base2)b = (Base2) same or child of Base 2
        // (Base2)b - internal obj b should be same or child of Base2 => child
        Base2 b2 = (Base2)b;// VALID

        //both compile check works fine
        //Run time b -internal is obj is Der4 and (Der3) - Nor same neither dervied of Der3 so RUN TIME ERROR -ClassCastException
//        Object o = (Der3)b;//INVALID

        //compile check 1 fails as base1 and base2 are not related // P->C nor C->P
//        Base2 b3 = (Base1)b;//INVALID
    }
}
