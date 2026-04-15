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

    String color;
    String name;
    String location;
    Integer energyLevel;
    Integer numberOfSides;

    public AbstractStone(String color, String name, String location, Integer energyLevel, Integer numberOfSides) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLevel = energyLevel;
        this.numberOfSides = numberOfSides;
    }
}