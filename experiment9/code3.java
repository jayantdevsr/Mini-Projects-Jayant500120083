class EvenNumberPrinter implements Runnable {
    private int limit;

    public EvenNumberPrinter(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Even numbers:");
        for (int i = 2; i <= limit; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddNumberPrinter implements Runnable {
    private int limit;

    public OddNumberPrinter(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= limit; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Introduce a slight delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class code3 {
    public static void main(String[] args) {
        int limit = 20; // Limit of numbers to print

        // Create threads for printing even and odd numbers
        Thread evenThread = new Thread(new EvenNumberPrinter(limit));
        Thread oddThread = new Thread(new OddNumberPrinter(limit));

        // Start threads
        evenThread.start();
        oddThread.start();
        System.out.println("Jayant Dev SAP: 500120083");
    }
}
