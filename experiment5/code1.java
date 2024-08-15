package JAVA.experiment5;
class jaysuper {
    private int privateMember;

    public void setPrivateMember(int value) {
        privateMember = value;
    }

    public int getPrivateMember() {
        return privateMember;
    }
}

class jaysub extends jaysuper {
    public void accessPrivateMember() {
        // Trying to access private member of the jaysuper
        // This will result in a compilation error
        int value = super.privateMember; 
    }
}

public class code1 {
    public static void main(String[] args) {
        // Create an object of the jaysub
        jaysub obj = new jaysub();
        // Attempting to access private member directly in the jaysub
        obj.accessPrivateMember();
    }
}
