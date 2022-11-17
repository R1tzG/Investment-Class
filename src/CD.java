public class CD extends Investment{
    private double amount;
    private double rate;
    private double term;
    public double totalValue;

    public CD(String name, String phoneNum, String ssn, int age, double getAmount, double getRate, double getTerm) {
        super(name, phoneNum, ssn, age);
        amount = getAmount;
        rate = getRate;
        term = getTerm;
        totalValue = calcValue();
    }

    public double calcValue() {
        return amount*(term*(rate/360));
    }

    public String toString() {
        return "CD Investment Value: " + totalValue;
    }
}
