//FACTORIAL
public class Main {
  static int factorial(int n){
    if(n==1){
      return 1;
    }
    else{
      return n*factorial(n-1);
    }
  }
    public static void main(String args[]) {
        System.out.println("Hello World!");
        int n=5;
        System.out.println(factorial(n));
    }
}