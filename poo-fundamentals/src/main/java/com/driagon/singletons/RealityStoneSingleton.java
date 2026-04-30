package com.driagon.singletons;

import com.driagon.models.RealityStone;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class RealityStoneSingleton {

    private static volatile RealityStone realityStone;

    public static RealityStone getInstance() {
        if (realityStone == null) {
            synchronized (RealityStoneSingleton.class) {
                if (realityStone == null) {
                    realityStone = new RealityStone();
                    log.info("Creating a new instance of RealityStone");
                }
            }
        } else {
            log.info("Returning existing instance of RealityStone");
        }
        return realityStone;
    }
}