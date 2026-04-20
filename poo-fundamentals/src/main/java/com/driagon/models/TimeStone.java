package com.driagon.models;

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
        System.out.println("The " + NAME + " allows the user to manipulate time, enabling time travel and the creation of time loops.");
    }
}