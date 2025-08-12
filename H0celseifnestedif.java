import java.util.Scanner;
class H0celseifnestedif
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int mark=sc.nextInt();
//else if
      if(mark>35&&mark<60)
      {
            System.out.println("i can get video games");
      }
      else if(mark>60&&mark<90)
      {
            System.out.println("i can get iphone");
      }
      else if(mark>90)
      {
            System.out.println("i can get macbook pro");
      }
      else
      {
            System.out.println("i can get scold");
      }
        }
    }
}
//nested if
if(mark>35&&mark<60)
{
      System.out.println("i can get video games");
      if(mark>35&&mark<60)
      {
            System.out.println("i can get video games");
      }
}