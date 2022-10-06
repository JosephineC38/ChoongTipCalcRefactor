public class TipCalculator {
    //Instance variables
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    //Constructor
    public TipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    //Methods
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return NOTDONE
    }

    public double totalBill() {

    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }
}
