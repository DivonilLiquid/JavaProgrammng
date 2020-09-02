import java.util.Scanner;  // Import the Scanner class
public class RadiusOfCircle{

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle ");
        double a = myObj.nextDouble();
        double pi=3.14159;
        double area=pi*a*a;
        System.out.println("Radius Of Circle is: "+area);
        
    }
}