package in.swapnilnakate.beans;

import in.swapnilnakate.Rule;

public class Slab {

    private final Double discount;
    private final Double lowerBound;
    private final Double upperBound;

    private Rule rule;

    public Slab(Double lowerBound, Double upperBound, Double discount) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.discount = discount;
    }


    public Double apply() {
        return rule.getAmount() * (discount/100);
    }


    public boolean isApplicable(Double purchaseAmount) {
        return (isGreater(purchaseAmount) || isEqual(purchaseAmount) ||
                isBetween(purchaseAmount));
    }


    public void setApplicableRule(Double purchaseAmount) {

        if ((isGreater(purchaseAmount) || isEqual(purchaseAmount))) {
            rule = new GreaterOrEqualRule(lowerBound, upperBound);
        } else if (isBetween(purchaseAmount)) {
            rule = new BetweenRule(purchaseAmount, lowerBound);
        }


    }


    public boolean isGreater(Double purchaseAmount) {
        return null != upperBound && upperBound < purchaseAmount;
    }


    public boolean isEqual(Double purchaseAmount) {
        return null != upperBound && upperBound.equals(purchaseAmount);

    }

    public boolean isBetween(Double purchaseAmount) {
        return (null != upperBound && upperBound > purchaseAmount && lowerBound < purchaseAmount) ||
                (null == upperBound && lowerBound < purchaseAmount);
    }
}
