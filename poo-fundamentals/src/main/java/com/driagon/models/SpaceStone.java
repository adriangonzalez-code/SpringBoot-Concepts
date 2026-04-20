package com.driagon.models;

public class SpaceStone extends AbstractStone {

    private static final String COLOR = "Blue";
    private static final String NAME = "Space Stone";
    private static final String LOCATION = "Tesseract";
    private static final Integer ENERGY_LEVEL = 7;

    public SpaceStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("The " + NAME + " allows the user to manipulate space, enabling teleportation and the creation of wormholes.");
    }
}