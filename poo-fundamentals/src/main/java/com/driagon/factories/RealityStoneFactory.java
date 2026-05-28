package com.driagon.factories;

import com.driagon.models.AbstractStone;
import com.driagon.models.RealityStone;
import com.driagon.prototypes.Prototypes;
import com.driagon.singletons.RealityStoneSingleton;
import lombok.extern.java.Log;

@Log
public class RealityStoneFactory extends ConfigurableStoneFactory {

    @Override
    public AbstractStone createStone() {
        if (super.isSingleton()) {
            return RealityStoneSingleton.getInstance();
        } else {
            log.info("Creating reality stone prototype for non-singleton factory");
            return Prototypes.REALITY_STONE_PROTOTYPE.buildPrototype(new RealityStone());
        }
    }
}