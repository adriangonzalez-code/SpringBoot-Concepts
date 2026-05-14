package com.driagon.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString
@Log
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
        // Business logic
        System.out.println("Using the power of the " + NAME + " in " + LOCATION + " to increase power and energy!\n" + super.toString() + "\n");
    }

    public PowerStone getPrototype() {
        try (final var bos = new ByteArrayOutputStream();
             final var oos = new ObjectOutputStream(bos)) {

            oos.writeObject(this);
            oos.flush();

            try (final var ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()))) {
                return (PowerStone) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException ex) {
            log.warning("Error creating prototype: " + ex.getMessage());
            throw new RuntimeException("Error creating prototype", ex);
        }
    }
}