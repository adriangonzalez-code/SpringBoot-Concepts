package com.driagon.models;

import lombok.ToString;

@ToString
public class PowerStone extends AbstractStone {

    private static final String COLOR = "Purple";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "Orb";
    private static final Integer ENERGY_LEVEL = 10;

    public PowerStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        // Business logic
        System.out.println("Using the power of the " + NAME + " in " + LOCATION + " to increase power and energy!\n" + super.toString() + "\n");
    }
}