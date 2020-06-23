package in.swapnilnakate.processors;

import in.swapnilnakate.Processor;
import in.swapnilnakate.beans.Slab;

public class GoldProcessor extends Processor {


    static {
        slabs.clear();
        addSlab(new Slab(0.0, 10000.0, 15.0));
        addSlab(new Slab(10000.0, 20000.0, 20.0));
        addSlab(new Slab(20000.0, null, 35.0));
    }

}