import java.util.Scanner;

class FactorialDemo{
  public static void main(String args[]){
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number whose factorial you want to find");
    int n = in.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++){
    fact *= i;
  }
  System.out.println("Factorial of "+n+" is "+fact);
  }

}
