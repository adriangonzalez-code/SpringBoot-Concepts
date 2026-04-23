package com.driagon.models;

import lombok.ToString;

@ToString
public class SoulStone extends AbstractStone {

    private static final String COLOR = "Orange";
    private static final String NAME = "Soul Stone";
    private static final String LOCATION = "Vormir";
    private static final Integer ENERGY_LEVEL = 10;

    public SoulStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        // Business logic
        System.out.println("Using the power of the " + NAME + " in " + LOCATION + " to total control!\n" + super.toString() + "\n");
    }
}