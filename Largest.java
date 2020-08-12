import java.util.Scanner;
class Largest{
  public static void main(String args[]){
     Scanner in= new Scanner(System.in);

     System.out.println("Enter the first digit");
     int a = in.nextInt();
     System.out.println("Enter the Second digit");
     int b = in.nextInt();
     System.out.println("Enter the third digit");
     int c = in.nextInt();

if(a>b && a>c)
System.out.println("a is the largest");
else if(b>a && b>c)
System.out.println("b is the largest");
else
System.out.println("c is the largest");
  }
}
