package in.swapnilnakate.beans;

import in.swapnilnakate.Rule;

public class GreaterOrEqualRule extends Rule {
    public GreaterOrEqualRule(Double lowerBound,Double upperBound) {
        super(lowerBound,upperBound,null);
    }


    @Override
    public Double getAmount() {
        return this.upperBound - this.lowerBound;
    }
}
