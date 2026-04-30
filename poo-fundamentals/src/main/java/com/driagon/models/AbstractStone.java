package com.driagon.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class AbstractStone {

    protected String color;
    protected String name;
    protected String location;
    protected Integer energyLevel;
    protected Integer numberOfSides;

    private static final int NUMBER_SIDES = 6;

    public AbstractStone(String color, String name, String location, Integer energyLevel) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLevel = energyLevel;
        this.numberOfSides = NUMBER_SIDES;
    }

    public abstract void usePower();
}