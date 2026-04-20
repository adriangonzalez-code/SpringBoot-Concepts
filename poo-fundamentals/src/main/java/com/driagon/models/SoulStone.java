package com.driagon.models;

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
        System.out.println("The " + NAME + " allows the user to manipulate the souls of the living and the dead.");
    }
}