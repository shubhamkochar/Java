class Arraysum{
  public static void main(String args[]){
    int a[]={1,2,3,4,5,6,7,8,9,10};// value in array initialized
    int sum=0;
    for (int x :a){
      System.out.println("Value in array is: "+x);
      sum +=x;
    }
    System.out.println("sum of array is"+sum);
  }
}
