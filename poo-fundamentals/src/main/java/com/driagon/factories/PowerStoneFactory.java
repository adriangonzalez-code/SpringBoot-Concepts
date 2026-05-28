package com.driagon.factories;

import com.driagon.models.AbstractStone;
import com.driagon.models.PowerStone;
import com.driagon.prototypes.Prototypes;
import com.driagon.singletons.PowerStoneSingleton;
import lombok.extern.java.Log;

@Log
public class PowerStoneFactory extends ConfigurableStoneFactory {

    @Override
    public AbstractStone createStone() {
        if (super.isSingleton()) {
            return PowerStoneSingleton.getInstance();
        } else {
            log.info("Creating power stone prototype for non-singleton factory");
            return Prototypes.POWER_STONE_PROTOTYPE.buildPrototype(new PowerStone());
        }
    }
}