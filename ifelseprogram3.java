import java.util.Scanner;
class ifelseprogram3
  {
    public static void main(String args[])
    {
      System.out.println("enter the value of m ");
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      if((m>0))
      {
        System.out.println("the value of n = 1");
      }
      else if((m==0))
      {
        System.out.println("the value of n ==0");
      }
      else
      {
        System.out.println("the value of n ==-1");
      }
    }
  }