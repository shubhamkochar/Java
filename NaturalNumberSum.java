import java.util.Scanner;

class Sum{
  public static void main(String args[]){
  Scanner in= new Scanner(System.in);
  System.out.println("Enter number of Natural numbers ");
  int n = in.nextInt();
  int sum=0;
  System.out.println("First "+n+" Natural numbers are.."+"\n");// Print the n(Input by you) natural number
  for(int i=1; i<=n; i++){
  System.out.println(i+"\n");
  sum = sum + i;
}
System.out.println(" Sum of First "+n+" natural numbers is "+sum+".");// Print the sum of n natural numbers
  }
}
