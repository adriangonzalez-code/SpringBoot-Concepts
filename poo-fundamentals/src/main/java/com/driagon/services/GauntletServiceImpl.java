package com.driagon.services;

import com.driagon.models.AbstractStone;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

//@Service
@Log
//@Setter
@AllArgsConstructor
public class GauntletServiceImpl implements GauntletService {

    // NO es inyección de dependencias
    //private final AbstractStone reality = MindStoneSingleton.getInstance();

    private final AbstractStone reality;
    private final AbstractStone mind;
    private final AbstractStone power;
    private final AbstractStone space;
    private final AbstractStone time;
    private final AbstractStone soul;

    @Override
    public void useGauntlet(String stoneName) {
        switch (stoneName.toLowerCase()) {
            case "reality" -> log.info("Using the Reality Stone's power to alter reality!: " + this.reality);
            case "mind" -> log.info("Using the Mind Stone's power to control minds!: " + this.mind);
            case "power" -> log.info("Using the Power Stone's power to increase power and energy!: " + this.power);
            case "space" -> log.info("Using the Space Stone's power to manipulate all things in space!: " + this.space);
            case "time" -> log.info("Using the Time Stone's power to control time!: " + this.time);
            case "soul" -> log.info("Using the Soul Stone's power to total control!: " + this.soul);
            default -> throw new IllegalArgumentException("Invalid stone name");
        }
    }

    @Override
    public void useFullPower() {
        if (this.time != null && this.soul != null && this.power != null && this.mind != null && this.space != null && this.reality != null) {
            log.info("Using the full power of the Infinity Gauntlet with all the stones!");
        } else {
            throw new IllegalStateException("Can't be using full power service because no stones are equipped");
        }
    }
}