package ge.edeu.btu;

public class Electricity {
    String customerNumber;
    Double amount;

    @Override
    public String toString() {
        return "Electricity{" +
                "customerNumber='" + customerNumber + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Electricity(String customerNumber, Double amount) {
        this.customerNumber = customerNumber;
        this.amount = amount;
    }




}
