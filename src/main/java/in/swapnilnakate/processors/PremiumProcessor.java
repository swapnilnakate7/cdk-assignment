package in.swapnilnakate.processors;

import in.swapnilnakate.Processor;
import in.swapnilnakate.beans.Slab;

public class PremiumProcessor extends Processor {


    static {
        slabs.clear();
        addSlab(new Slab(0.0, 4000.0, 10.0));
        addSlab(new Slab(4000.0, 8000.0, 15.0));
        addSlab(new Slab(8000.0, 12000.0, 20.0));
        addSlab(new Slab(12000.0, null, 30.0));
    }
}
