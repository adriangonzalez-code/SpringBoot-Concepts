package com.driagon.factories;

import com.driagon.models.AbstractStone;
import com.driagon.models.TimeStone;
import com.driagon.prototypes.Prototypes;
import com.driagon.singletons.TimeStoneSingleton;
import lombok.extern.java.Log;

@Log
public class TimeStoneFactory extends ConfigurableStoneFactory {

    @Override
    public AbstractStone createStone() {
        if (super.isSingleton()) {
            return TimeStoneSingleton.getInstance();
        } else {

            return Prototypes.TIME_STONE_PROTOTYPE.buildPrototype(new TimeStone());
        }
    }
}
