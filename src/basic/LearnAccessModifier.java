package basic;

public class LearnAccessModifier {

    // Access Modifier/ Access Specifier: Class,variable,method
    // Private: only we can call or use within the class where it is located
    // Public: we can call or use within the class where ti is located and from any other class
    // protected: only accessible from all the class of that particular package.

    // Access Modifier:

    // Public
    // Private
    // Protected
    // Default

   public String name="Jame";
   private String address="Queens,NY";
   protected String contractNumber="89798793223";
   int num= 21;

   protected void display(){
       System.out.println("We are learning Access Modifier");
    }

    public static void main(String[] args) {

    int num1=20;
        System.out.println(num1); //20
        num1=25;

        System.out.println(num1); // 25

        LearnNestedClass.Computer comp=new LearnNestedClass.Computer();
        System.out.println(comp.computerName);

    }
}
