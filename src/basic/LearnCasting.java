package basic;

public class LearnCasting {
    // Casting means converting data type
    // Primitive dataType to Primitive dataType

    public static void main(String[] args) {
        double price=35.999;
        int newPrice= (int) price;
        System.out.println(newPrice);

        int num1= 30;
        int num2=40;
        int num3=num1;
        int num4=num3+num2;
        System.out.println(num4); //

        int age = 24;
        double newAge=(double) age;
        System.out.println(newAge);

        int number=566;
        byte total=(byte)number;
        System.out.println("Int to Byte "+total);
    }
}
