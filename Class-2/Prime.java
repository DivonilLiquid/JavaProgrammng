import java.util.Scanner;  // Import the Scanner class
//Prime Number
public class Prime {
	static void print_first_N_primes(int N)  
	{
		int i, j, flag;  
  		System.out.println("Prime numbers between 1 and "+ N + " are:");  
  		for (i = 1; i <= N; i++)
  			{
  				if (i == 1 || i == 0)  
            	continue;  
        	flag = 1;  
  
        	for (j = 2; j <= i / 2; ++j)  
        	{  
            	if (i % j == 0) 
            	{  
                	flag = 0;  
                	break;  
            	}  
        	}  
        if (flag == 1)  
            System.out.print(i + " ");  
    	}  
	}  
  public static void main (String[] args)
  {
  	Scanner myObj = new Scanner(System.in);
  	int N = myObj.nextInt(); 
    print_first_N_primes(N);  
  } 

} 
