package JavaOOPS.Chap1;
class TestDefault{
 public TestDefault(){
     System.out.println("Default means package level modifier");
 }

}
public class DefaultAccessMod {
    public static void main(String[] args) {
        TestDefault obj = new TestDefault();

    }
}
