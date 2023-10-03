import java.util.Scanner;
class marks
  {
    public static void main(String args[])
    {
      int maks;
      System.out.println("enter the marks");
      Scanner sc=new Scanner(System.in);
      maks=sc.nextInt();
      
      if((maks>=90)&&(maks<=100))
      {
        System.out.println("Grade : A");
      }
      else if((maks>=80)&&(maks<=90))
      {
        System.out.println("Grade: B");
      }
      else if((maks>=70)&&(maks<=79))
      {
        System.out.println("Grade:C");
      }
      else if((maks>=60)&&(maks<=69))
      {
        System.out.println("Grade : B");
      }
      else if((maks>=50)&&(maks<=59))
      {
        System.out.println("Grade: D");
      }
      else
      {
       System.out.println("fail"); 
      }
      
    }
  }