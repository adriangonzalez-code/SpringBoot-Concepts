package com.driagon.singletons;

import com.driagon.models.TimeStone;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class TimeStoneSingleton {

    private static volatile TimeStone timeStone;

    public static TimeStone getInstance() {
        if (timeStone == null) {
            synchronized (TimeStoneSingleton.class) {
                if (timeStone == null) {
                    timeStone = new TimeStone();
                    log.info("Creating a new instance of TimeStone");
                }
            }
        } else {
            log.info("Returning existing instance of TimeStone");
        }
        return timeStone;
    }
}