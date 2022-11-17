public class MutualFund extends Investment {
    private double units;
    private double unitValue;
    public double totalValue;
    public MutualFund(String name, String phoneNum, String ssn, int age, double getUnits, double getUnitValue) {
        super(name, phoneNum, ssn, age);
        units = getUnits;
        unitValue = getUnitValue;
        totalValue = calcValue();
    }

    public double calcValue() {
        return units*unitValue;
    }

    public String toString() {
        return "MutualFund Investment Value: " + totalValue;
    }
}
