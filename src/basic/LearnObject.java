package basic;

public class LearnObject {

    // ClassName objectName = New ConstructorOfClass();


    public static void main(String[] args) {

        LearnDataType dataType=new LearnDataType();
        dataType.pizzaSize='M';  // reassign
        System.out.println(dataType.pizzaSize);

        dataType.firstName="Jack";
        String fName=dataType.firstName="Jack";
        System.out.println(fName);
        //dataType.firstName="Soumia"
        String smia= dataType.firstName="soumia";
        System.out.println(smia);



    }



}
