import java.util.Scanner;
class triangle
{
  public static void main(String args[])
  {
    System.out.println("enter the values");
    Scanner sc=new Scanner(System.in);
    int s1=sc.nextInt();
    int s2=sc.nextInt();
    int s3=sc.nextInt();
    if((s1==s2)&&(s2==s3)&&(s1==s3))
    {
      System.out.println("The Given Triangle is Equilateral triangle");
    }
    else if((s1==s2)||(s2==s3)||(s1==s3))
    {
      System.out.println("The Given Triangle is Isosceles Triangle");
    }
    else
    {
      System.out.println("The Given Triangle is Scalene Triangle");
    }
  }
}