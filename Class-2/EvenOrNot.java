import java.util.Scanner;  // Import the Scanner class
public class EvenOrNot{

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number ");
        int a = myObj.nextInt();
        if(a%2==0){
        	System.out.println("Number is Even ");
        }
        else{
        	System.out.println("Number is Odd ");
        }
    }
}