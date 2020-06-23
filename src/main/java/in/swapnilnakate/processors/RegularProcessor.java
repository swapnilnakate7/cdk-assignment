package in.swapnilnakate.processors;

import in.swapnilnakate.Processor;
import in.swapnilnakate.beans.Slab;

import java.util.Set;

public class RegularProcessor extends Processor  {




    static {
        slabs.clear();
        addSlab(new Slab(0.0, 5000.0, 0.0));
        addSlab(new Slab(5000.0, 10000.0, 15.0));
        addSlab(new Slab(10000.0, null, 20.0));
    }
}
