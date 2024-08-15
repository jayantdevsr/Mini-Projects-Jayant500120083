package experiment4;

class code4 {
    void sum(int a,long b)
    {
        System.out.println("the sum of A and B is: "+ (a+b));
    }
    void sum(int a,int b, int c)
    {
        System.out.println("the sum of A, B and C is: "+ (a+b+c));
    }

    public static void main(String[] args) {
        code4 cal=new code4();
        cal.sum(20,20);
        cal.sum(20,30,40);
    }
    
}
