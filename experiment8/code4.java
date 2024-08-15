class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class student {
    private String name;
    private int age;

    public student(String name, int age) throws NameException, AgeException {
        if (name.matches(".*\\d.*")) {
            throw new NameException("Name cannot be contain numb");
        }
        if (age > 50) {
            throw new AgeException("Age must be less than or equal to 50.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class code4 {
    public static void main(String[] args) {
        try {
            student student1 = new student("Jayant", 22);
            System.out.println("student 1 details:");
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("JAYANT DEV SAP: 500120083");

            student student2 = new student("123", 55); // This will throw exceptions
        } catch (NameException e) {
            System.out.println("Name Exception: " + e.getMessage());
        } catch (AgeException e) {
            System.out.println("Age Exception: " + e.getMessage());
        }
    }
}
