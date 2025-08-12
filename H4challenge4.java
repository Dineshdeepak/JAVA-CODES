import java.util.Scanner;
class H4challenge4
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your slary:");
            int salary=sc.nextInt();
            System.out.print("enter your age:");
            int age=sc.nextInt();
      if(salary>=20000&&age<=25)
      {
            System.out.print("enter required loan amount:");
            int reqloanamt=sc.nextInt();
            System.out.println("enter required loan amount:"+reqloanamt);
             if(reqloanamt<=50000)
            {
                System.out.println("you are eligible");
            }
            else 
            {
                System.out.println("maximam loan amount is 50000");
            }
            
        }
      else
       {
        System.out.println("you are not eligible");
       }
        
    }
 }
}     