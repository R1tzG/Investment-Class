public abstract class Investment {
    public String name;
    public String phoneNum;
    public String ssn;
    public int age;
    private double totalValue;

    public Investment(String getName, String getPhone, String getSSN, int getAge) {
        name = getName;
        phoneNum = getPhone;
        ssn = getSSN;
        age = getAge;
    }

    protected void setValue(double newValue) {
        totalValue = newValue;
    }

    public double getValue() {
        return totalValue;
    }

    public String getSSN() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public abstract double calcValue();

    public String toString() {
        return "Investment Value: " + totalValue;
    }

    public double compareTo(Investment investment) {
        return this.totalValue - investment.totalValue;
    }
}
