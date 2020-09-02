//PALINDROME
public class Main {
    static boolean paliandrome(String s){
    int i=0,j=s.length()-1;
    while(i<j){
      if(s.charAt(i)!=s.charAt(j)){
        return false;
      }
      i++;
      j--;
  }
    return true;
  }
    public static void main(String args[]) {
        System.out.println("Hello World!");
        String s="TENET";

        //make function paliandrome
        if(paliandrome(s)){
          System.out.println("Yes");
        }
        else{
          System.out.println("NO");
        }
    }
}