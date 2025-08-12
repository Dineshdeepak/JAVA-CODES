import java.util.Scanner;
class C3challenge3{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            String name=sc.nextLine();
            float score=sc.nextInt();
            sc.nextLine();
            String department=sc.nextLine();
            float Score=(score/10);
            System.out.println("my name is " +name);
            System.out.println("my score is "+Score+"/10");
            System.out.println("my department is "+department);
        }
    }
}