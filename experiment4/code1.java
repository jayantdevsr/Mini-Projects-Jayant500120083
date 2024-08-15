package experiment4;

class code1 {
    int data;
    void setData(int B) {
        data = B;
    }
    int getData() {
        return data;
    }

    public static void main(String[] args) {
        code1 a = new code1();
        a.setData(10);
        System.out.println("Data: " + a.getData());
    }
}
