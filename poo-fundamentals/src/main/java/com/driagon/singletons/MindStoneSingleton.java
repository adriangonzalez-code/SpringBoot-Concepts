package com.driagon.singletons;

import com.driagon.models.MindStone;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class MindStoneSingleton {

    private static volatile MindStone mindStone;

    public static MindStone getInstance() {
        if (mindStone == null) {
            synchronized (MindStoneSingleton.class) {
                if (mindStone == null) {
                    mindStone = new MindStone();
                    log.info("Creating a new instance of MindStone");
                }
            }
        } else {
            log.info("Returning existing instance of MindStone");
        }
        return mindStone;
    }
}