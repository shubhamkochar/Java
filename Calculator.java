import java.util.Scanner;

class {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the operation");
    System.out.println("  Enter                  1     for        Addition ");
    System.out.println("  Enter                  2     for        Subtraction ");
    System.out.println("  Enter                  3     for        Multiplication ");
    System.out.println("  Enter                  4     for        Division ");

    System.out.println("Enter the first and second digit");
    double b= in.nextDouble();
    double c= in.nextDouble();

    System.out.println("Enter the Operation");
    int a =in.nextInt();

    switch(a){
      case 1:
       System.out.println("Addition is "+ (b+c));
       break;
      case 2:
        System.out.println("Subraction is "+(b-c));
        break;
      case 3:
        System.out.println("Multiplication is "+(b*c));
        break;
      case 4:
        System.out.println("Division is "+(b/c));
        break;
      default:
        System.out.println(" Please select a valid operator ");

    }


  }
}
