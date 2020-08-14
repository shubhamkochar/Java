import java.util.Scanner;

class Sumavg{
  public static void main(String args[]){
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the total number of digits");
    int n = in.nextInt();
    double sum =0;
    for(int i=1; i<=n; i++){
      System.out.println("Enter the digit number "+i+" :-");
      double a= in.nextDouble();
      sum += a;
    }
    System.out.println("\nSum of entered digits is "+sum);
    System.out.println("\nThe average of entered digits is "+(sum/n));
  }
}
