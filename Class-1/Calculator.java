//CALCULATOR
public class Calculator {
  static int Addition(int a,int b){
    return a+b;
  }
  static int Subtraction(int a,int b){
    return a-b;
  }
  static int Multiplication(int a,int b){
    return a*b;
  }
  static float Division(int a,int b){
    return a/b;
  }

    public static void main(String args[]) {
        int a=10,b=2;
        System.out.println("1.Addition"+"\n");
        System.out.println(Addition(a,b)+"\n");
        System.out.println("2.Subtraction"+"\n");
        System.out.println(Subtraction(a,b)+"\n");
        System.out.println("3.Multiplication"+"\n");
        System.out.println(Multiplication(a,b)+"\n");
        System.out.println("4.Division");
        System.out.println(Division(a,b)+"\n");
        
    }
}