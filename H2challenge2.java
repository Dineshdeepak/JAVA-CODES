import java.util.Scanner;
class H2challenge2 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int english=sc.nextInt();
            int maths=sc.nextInt();
            int science=sc.nextInt();
            int social=sc.nextInt();
            int tamil=sc.nextInt();
            int total=(english+maths+science+social+tamil);
            int avg=total/5;

      if(avg<35)
      {
            System.out.println("additional class is required");
      }
      
      else
      {
            System.out.println("you are good");
      }
        }
    }
}
    

