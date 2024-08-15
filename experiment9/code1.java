class jay extends Thread {
    private int start;
    private int end;

    public jay(int start, int end) {
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

public class code1 {
    public static void main(String[] args) {
        int totalnumb = 10;
        int threadc = 4; 

        int numbersPerThread = totalnumb / threadc;
        int remainnumb = totalnumb % threadc;

        for (int i = 0, start = 1, end; i < threadc; i++, start = end + 1) {
            end = start + numbersPerThread - 1;
            if (i == threadc - 1) {
                end += remainnumb; 
            }
            jay thread = new jay(start, end);
            thread.start();
        }
        System.out.println("Jayant Dev SAP: 500120083");
    }
}
