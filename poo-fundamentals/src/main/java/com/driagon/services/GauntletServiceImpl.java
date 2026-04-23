package com.driagon.services;

import com.driagon.models.AbstractStone;
import com.driagon.models.RealityStone;
import lombok.extern.java.Log;

//@Service
@Log
public class GauntletServiceImpl implements GauntletService {

    public AbstractStone reality = new RealityStone();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("Using gauntlet with stone: " + stoneName);
    }
}
