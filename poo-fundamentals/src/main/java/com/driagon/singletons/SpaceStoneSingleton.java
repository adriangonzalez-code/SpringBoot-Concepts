package com.driagon.singletons;

import com.driagon.models.SpaceStone;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class SpaceStoneSingleton {

    private static volatile SpaceStone spaceStone;

    public static SpaceStone getInstance() {
        if (spaceStone == null) {
            synchronized (SpaceStoneSingleton.class) {
                if (spaceStone == null) {
                    spaceStone = new SpaceStone();
                    log.info("Creating a new instance of SpaceStone");
                }
            }
        } else {
            log.info("Returning existing instance of SpaceStone");
        }
        return spaceStone;
    }

}