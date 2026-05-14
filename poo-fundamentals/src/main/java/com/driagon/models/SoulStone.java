package com.driagon.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString
@Log
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
        // Business logic
        System.out.println("Using the power of the " + NAME + " in " + LOCATION + " to total control!\n" + super.toString() + "\n");
    }

    public SoulStone getPrototype() {
        try (final var bos = new ByteArrayOutputStream();
             final var oos = new ObjectOutputStream(bos)) {

            oos.writeObject(this);
            oos.flush();

            try (final var ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()))) {
                return (SoulStone) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException ex) {
            log.warning("Error creating prototype: " + ex.getMessage());
            throw new RuntimeException("Error creating prototype", ex);
        }
    }
}