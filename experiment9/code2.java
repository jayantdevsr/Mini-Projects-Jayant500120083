class NumPrint implements Runnable {
    private int start;
    private int end;

    public NumPrint(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class code2 {
    public static void main(String[] args) {
        int totalnumb = 10;
        int threadc = 4; 

        int numbersPerThread = totalnumb / threadc;
        int remainingNumbers = totalnumb % threadc;

        for (int i = 0, start = 1, end; i < threadc; i++, start = end + 1) {
            end = start + numbersPerThread - 1;
            if (i == threadc - 1) {
                end += remainingNumbers; 
            }
            NumPrint NumPrint = new NumPrint(start, end);
            Thread thread = new Thread(NumPrint);
            thread.start();
            
        }
        System.out.println("Jayant Dev SAP: 500120083");
    }
}
