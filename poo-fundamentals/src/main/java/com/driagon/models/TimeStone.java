package com.driagon.models;

import lombok.ToString;

@ToString
public class TimeStone extends AbstractStone {

    private static final String COLOR = "Green";
    private static final String NAME = "Time Stone";
    private static final String LOCATION = "Eye of Agamotto";
    private static final Integer ENERGY_LEVEL = 9;

    public TimeStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        // Business logic
        System.out.println("Using the power of the " + NAME + " in " + LOCATION + " to control time!\n" + super.toString() + "\n");
    }
}