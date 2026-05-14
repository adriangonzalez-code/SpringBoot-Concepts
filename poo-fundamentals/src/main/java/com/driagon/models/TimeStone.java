package com.driagon.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString
@Log
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

    public TimeStone getPrototype() {
        try (final var bos = new ByteArrayOutputStream();
             final var oos = new ObjectOutputStream(bos)) {

            oos.writeObject(this);
            oos.flush();

            try (final var ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()))) {
                return (TimeStone) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException ex) {
            log.warning("Error creating prototype: " + ex.getMessage());
            throw new RuntimeException("Error creating prototype", ex);
        }
    }
}