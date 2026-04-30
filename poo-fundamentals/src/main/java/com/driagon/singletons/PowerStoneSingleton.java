package com.driagon.singletons;

import com.driagon.models.PowerStone;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class PowerStoneSingleton {

    private static volatile PowerStone powerStone;

    public static PowerStone getInstance() {
        if (powerStone == null) {
            synchronized (PowerStoneSingleton.class) {
                if (powerStone == null) {
                    powerStone = new PowerStone();
                    log.info("Creating a new instance of PowerStone");
                }
            }
        } else {
            log.info("Returning existing instance of PowerStone");
        }
        return powerStone;
    }
}