import java.util.Scanner;
class vowelprogram2
  {
    public static void main(String args[])
    {
      System.out.println("enter the string");
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      for(int i=0;i<s.length();i++)
        {
           if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='o')||(s.charAt(i)=='u')||(s.charAt(i)=='i'))
           {
             System.out.println(s.charAt(i));
           }
        }
    }
  }