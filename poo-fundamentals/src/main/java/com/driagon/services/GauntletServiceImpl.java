package com.driagon.services;

import com.driagon.models.AbstractStone;
import com.driagon.models.RealityStone;
import com.driagon.singletons.MindStoneSingleton;
import lombok.extern.java.Log;

//@Service
@Log
public class GauntletServiceImpl implements GauntletService {

    private final AbstractStone reality = MindStoneSingleton.getInstance();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("Using gauntlet with stone: " + stoneName);
    }
}