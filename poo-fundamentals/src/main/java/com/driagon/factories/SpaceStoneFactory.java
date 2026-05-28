package com.driagon.factories;

import com.driagon.models.AbstractStone;
import com.driagon.models.SpaceStone;
import com.driagon.prototypes.Prototypes;
import com.driagon.singletons.SpaceStoneSingleton;
import lombok.extern.java.Log;

@Log
public class SpaceStoneFactory extends ConfigurableStoneFactory {

    @Override
    public AbstractStone createStone() {
        if (super.isSingleton()) {
            return SpaceStoneSingleton.getInstance();
        } else {
            log.info("Creating space stone prototype for non-singleton factory");
            return Prototypes.SPACE_STONE_PROTOTYPE.buildPrototype(new SpaceStone());
        }
    }
}