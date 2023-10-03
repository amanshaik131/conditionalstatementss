import java.util.Scanner;
class positive_or_not
  {
    public static void main(String args[])
    {
      System.out.println("enter the any  value");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n>=0)
      {
        System.out.println("Positive number");
      }
      else
      {
        System.out.println("Negative number");
      }
    }
  }