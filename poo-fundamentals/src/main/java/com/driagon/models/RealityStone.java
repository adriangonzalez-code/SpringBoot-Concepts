package com.driagon.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString
@Log
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
        // Business logic
        System.out.println("Using the power of the " + NAME + " in " + LOCATION + " to alter reality!\n" + super.toString() + "\n");
    }

    public RealityStone getPrototype() {
        try (final var bos = new ByteArrayOutputStream();
             final var oos = new ObjectOutputStream(bos)) {

            oos.writeObject(this);
            oos.flush();

            try (final var ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()))) {
                return (RealityStone) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException ex) {
            log.warning("Error creating prototype: " + ex.getMessage());
            throw new RuntimeException("Error creating prototype", ex);
        }
    }
}