import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
public class HelloWorld
{
	public static void main (String[] args) 
	{
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              //reads string  
		System.out.print("You have entered: "+str); 
	}
}
