package com.driagon.factories;

import com.driagon.models.AbstractStone;
import com.driagon.models.SoulStone;
import com.driagon.prototypes.Prototypes;
import com.driagon.singletons.SoulStoneSingleton;
import lombok.extern.java.Log;

@Log
public class SoulStoneFactory extends ConfigurableStoneFactory {

    @Override
    public AbstractStone createStone() {
        if (super.isSingleton()) {
            return SoulStoneSingleton.getInstance();
        } else {
            log.info("Creating soul stone prototype for non-singleton factory");
            return Prototypes.SOUL_STONE_PROTOTYPE.buildPrototype(new SoulStone());
        }
    }
}