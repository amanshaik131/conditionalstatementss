import java.util.Scanner;
class Even_Odd
  {
    public static void main(String args[])
    {
      int n;
      System.out.println("enter the n value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(n%2==0)
      {
        System.out.println("even number");
      }
      else{
        System.out.println("odd number");
      }
    }
  }