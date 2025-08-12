import java.util.Scanner;
class 31challenge3 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter traffic signal colour:");
            String colour=sc.nextLine();

      if(colour.equals("red"))
      {
            System.out.println("stop");
      }
      
      else if(colour.equals("yellow"))
      {
            System.out.println("get ready");
      }
      else{
        System.out.println("go");
      }
        }

    }
}
    

