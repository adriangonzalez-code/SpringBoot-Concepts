package com.driagon.models;

public class RealityStone extends AbstractStone {

    private static final String COLOR = "Red";
    private static final String NAME = "Reality Stone";
    private static final String LOCATION = "Asgard";
    private static final Integer ENERGY_LEVEL = 6;

    public RealityStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("The " + NAME + " allows the user to warp reality, creating illusions and changing the fabric of existence.");
    }
}