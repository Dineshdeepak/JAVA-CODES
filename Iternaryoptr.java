//ternary operator
/* syntax
     variable=(condition)?valueiftrue:valueiffalse */


import java.util.Scanner;
class Iternaryoptr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        String result=num1>num2?"num1 is greater ":"num2 is greater";
        System.out.println(result);
    }
}