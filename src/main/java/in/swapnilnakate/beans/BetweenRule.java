package in.swapnilnakate.beans;

import in.swapnilnakate.Rule;

public class BetweenRule extends Rule {

    public BetweenRule(Double purchaseAmount, Double lowerBound) {
        super(lowerBound,null,purchaseAmount);
    }




    @Override
    public Double getAmount() {
        return purchaseAmount - lowerBound;
    }



}
