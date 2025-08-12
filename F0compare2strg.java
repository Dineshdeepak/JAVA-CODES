
class F0compare2strg
{
    public static void main(String args[])
    {
        String f1= new String("apple");
        String f2=new String("apple");

        System.out.println(f1.equals(f2));//right statement 
        System.out.println(f1==f2);//wrong statement
    }
}