package experiment4;
import java.util.Scanner;

class StudentRecord {
     int rollNo;
     int phymrks;
     int chemmrk;
     int mthmrk;

    
    public StudentRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll number of the student: ");
        rollNo = sc.nextInt();

        System.out.println("Enter marks in Physics: ");
        phymrks = sc.nextInt();

        System.out.println("Enter marks in Chemistry: ");
        chemmrk = sc.nextInt();

        System.out.println("Enter marks in Maths: ");
        mthmrk = sc.nextInt();

        sc.close();
    }

    public void calculateAndDisplayResult() {
        double phyperc = (phymrks / 100.0) * 100;
        double chemperc = (chemmrk / 100.0) * 100;
        double mathperc = (mthmrk / 100.0) * 100;

        double aggperc = (phyperc + chemperc + mathperc) / 3;

        if (phyperc < 40 || chemperc < 40 || mathperc < 40) {
            System.out.println("Student with Roll No " + rollNo + " has failed in one or more subjects.");
        } else {
            System.out.println("Student with Roll No " + rollNo + " has passed.");

            if (aggperc >= 75) {
                System.out.println("You have got Distinction.");
            } else if (aggperc >= 60) {
                System.out.println("You have got First Division.");
            } else if (aggperc >= 50) {
                System.out.println("You have got Second Division.");
            } else if (aggperc >= 40) {
                System.out.println("You have got Third Division.");
            }
        }
    }
}

class Code2 {
    public static void main(String args[]) {
        StudentRecord stu = new StudentRecord();
        stu.calculateAndDisplayResult();
    }
}
