package com.driagon.singletons;

import com.driagon.models.SoulStone;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class SoulStoneSingleton {

    private static volatile SoulStone soulStone;

    public static SoulStone getInstance() {
        if (soulStone == null) {
            synchronized (SoulStoneSingleton.class) {
                if (soulStone == null) {
                    soulStone = new SoulStone();
                    log.info("Creating a new instance of SoulStone");
                }
            }
        } else {
            log.info("Returning existing instance of SoulStone");
        }
        return soulStone;
    }
}