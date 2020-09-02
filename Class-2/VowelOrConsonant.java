import java.util.Scanner;  // Import the Scanner class
public class VowelOrConsonant{

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Character ");
        char a = myObj.next().charAt(0);
        boolean flag=false;
        switch(a){
        	case 'a':
        	flag=true;
        	case 'e':
        	flag=true;
        	case 'i':
        	flag=true;
        	case 'o':
        	flag=true;
        	case 'u':
        	flag=true;
        	case 'A':
        	flag=true;
        	case 'E':
        	flag=true;
        	case 'I':
        	flag=true;
        	case 'O':
        	flag=true;
        	case 'U':
        	flag=true;
        	default:
        	flag=false;
        }
        if(flag==true){
        	System.out.println("The Character is Vowel");
        }
        else{
        	System.out.println("The Character is Consonant");
        }
    }
}