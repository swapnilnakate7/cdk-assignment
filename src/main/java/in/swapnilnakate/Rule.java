package in.swapnilnakate;

public abstract class Rule {

    protected Double lowerBound;
    protected Double upperBound;
    protected Double purchaseAmount;


    public Rule(Double lowerBound, Double upperBound, Double purchaseAmount) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.purchaseAmount = purchaseAmount;
    }

    public abstract Double getAmount();

    @Override
    public String toString() {
        return "Rule{" +
                "lowerBound=" + lowerBound +
                ", upperBound=" + upperBound +
                ", purchaseAmount=" + purchaseAmount +
                '}';
    }
}
