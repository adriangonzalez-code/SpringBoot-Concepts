package com.driagon.models;

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
        System.out.println("The " + NAME + " allows the user to manipulate and unleash massive amounts of energy.");
    }
}