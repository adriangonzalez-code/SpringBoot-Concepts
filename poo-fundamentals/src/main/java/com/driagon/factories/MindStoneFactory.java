package com.driagon.factories;

import com.driagon.models.AbstractStone;
import com.driagon.models.MindStone;
import com.driagon.prototypes.Prototypes;
import com.driagon.singletons.MindStoneSingleton;
import lombok.extern.java.Log;

@Log
public class MindStoneFactory extends ConfigurableStoneFactory {

    @Override
    public AbstractStone createStone() {
        if (super.isSingleton()) {
            return MindStoneSingleton.getInstance();
        } else {
            log.info("Creating mind stone prototype for non-singleton factory");
            return Prototypes.MIND_STONE_PROTOTYPE.buildPrototype(new MindStone());
        }
    }
}
