package experiment4;

public class code5
{
    int id;
    String name;
    int age;
    code5(int i, String n)
    {
        id=i;
        name=n;
    }
    code5(int i, String n, int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String arg[])
    {
        code5 jay1 =new code5(599,"Jayant");
        code5 jay2 =new code5(699,"Jayesh");
        code5 jay3 =new code5(999,"Harsh",22);
        jay1.display();
        jay2.display();
        jay3.display();
    }
}