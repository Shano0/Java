package ge.edeu.btu;

public class Water {
    String customerNumber;
    Double amount;

    @Override
    public String toString() {
        return "Water{" +
                "customerNumber='" + customerNumber + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Water(String customerNumber, Double amount) {
        this.customerNumber = customerNumber;
        this.amount = amount;
    }
}
