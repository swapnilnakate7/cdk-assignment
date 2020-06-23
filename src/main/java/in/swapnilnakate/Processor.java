package in.swapnilnakate;

import in.swapnilnakate.beans.Slab;

import java.util.HashSet;
import java.util.Set;

public abstract class Processor {
    protected static final Set<Slab> slabs = new HashSet<Slab>();

    public  Double process(Double purchaseAmount){
        Double discountAmount = 0.0;
        //process Premium slabs
        Set<Slab> slabs = getApplicableSlabs(purchaseAmount);
        for (Slab slab : slabs) {
            discountAmount += slab.apply();
        }

        return purchaseAmount-discountAmount;
    }

    public static void addSlab(Slab slab){
        slabs.add(slab);
    }

    public Set<Slab> getApplicableSlabs(final Double purchaseAmount){
        Set<Slab> applicableSlabs= new HashSet<Slab>();
        slabs.forEach(slab ->{
            if(slab.isApplicable(purchaseAmount)){
                slab.setApplicableRule(purchaseAmount);
                applicableSlabs.add(slab);
            }
        });

        return applicableSlabs;
    }
}
