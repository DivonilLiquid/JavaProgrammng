import java.util.Scanner;  // Import the Scanner class
public class DoubleMultipy{

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double a = myObj.nextDouble();
        System.out.println("Enter number 2: ");
        double b = myObj.nextDouble();
        double res=a*b;
        System.out.println("Multiplication of two number is "+res);
    }
}