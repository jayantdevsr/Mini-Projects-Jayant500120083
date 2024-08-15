// package experiment3;

import java.util.Scanner;
class student {
    int rollno;
    String name;
    double marks;
    public void insertData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rollno");
        rollno=sc.nextInt();
        System.out.println("enter name of the student");
        name=sc.next();
        System.out.println("enter the marks");
        marks=sc.nextDouble();
    sc.close();
    }
    public void printArea()
    {
        System.out.println("Rollno: "+rollno);
        System.out.println("Name of the student:"+name);
        System.out.println("marks is: "+marks);
        System.out.println("jayant dev\n500120083");
    }

}

class code4sturec {
        
    public static void main(String[] args) {
        student stu=new student();
        stu.insertData();
        stu.printArea();
    }
    
}
