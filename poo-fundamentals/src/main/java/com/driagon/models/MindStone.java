package com.driagon.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString(callSuper = true)
@Log
public class MindStone extends AbstractStone {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final String COLOR = "Yellow";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Scepter";
    private static final Integer ENERGY_LEVEL = 8;

    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        // Business logic
        System.out.println("Using the power of the " + NAME + " in " + LOCATION + " to control minds!\n" + super.toString() + "\n");
    }

    public MindStone getPrototype() {
        try (final var bos = new ByteArrayOutputStream();
             final var oos = new ObjectOutputStream(bos)) {

            oos.writeObject(this);
            oos.flush();

            try (final var ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()))) {
                return (MindStone) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException ex) {
            log.warning("Error creating prototype: " + ex.getMessage());
            throw new RuntimeException("Error creating prototype", ex);
        }
    }
}