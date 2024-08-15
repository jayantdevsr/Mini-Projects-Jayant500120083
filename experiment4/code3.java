package experiment4;
class code3
{
    public void jay1()
    {
        System.out.println("Hello this is line 1 code");
    }
    public void jay1(int a)
    {
        System.out.println("Code line 2 using int datatype");
    }
    public void jay1(double b)
    {
        System.out.println("Code line 3 using double datatype");
    }

    public static void main(String[] args) {
        code3 mycode=new code3();
        mycode.jay1();
        mycode.jay1(5);
        mycode.jay1(13.5);
    }
}