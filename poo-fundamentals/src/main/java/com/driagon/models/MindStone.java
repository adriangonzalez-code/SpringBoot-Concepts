package com.driagon.models;

public class MindStone extends AbstractStone {

    private static final String COLOR = "Yellow";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Scepter";
    private static final Integer ENERGY_LEVEL = 8;

    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("The " + NAME + " allows the user to enhance mental abilities and control the minds of others.");
    }
}