package JAVA.experiment5;
class Worker {
    protected String name;
    protected double salarycost;

   
    public Worker(String name, double salarycost) {
        this.name = name;
        this.salarycost = salarycost;
    }

   
    public double computedpayment(int hours) {
        return salarycost * hours; 
    }
}


class dworker extends Worker {
   
    public dworker(String name, double salarycost) {
        super(name, salarycost);
    }

    @Override
    public double computedpayment(int days) {
        return salarycost * days; 
    }
}

class salworker extends Worker {
    public salworker(String name, double salarycost) {
        super(name, salarycost);
    }

    @Override
    public double computedpayment(int hours) {
        return salarycost * 40; 
    }
}

public class code3 {
    public static void main(String[] args) {
        dworker dworker = new dworker("Jayant", 25.0);
        salworker salworker = new salworker("jayesh", 1000.0);

        double dpay = dworker.computedpayment(5); 
        double salariedPay = salworker.computedpayment(45);

        System.out.println("Weekly pay for " + dworker.name + ": $" + dpay);
        System.out.println("Weekly pay for " + salworker.name + ": $" + salariedPay);
        System.out.println("Jayant dev SAP:500120083");
    }
}
