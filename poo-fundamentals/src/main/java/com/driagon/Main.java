package com.driagon;

import com.driagon.models.MindStone;
import com.driagon.prototypes.Prototypes;
import com.driagon.services.GauntletServiceImpl;
import com.driagon.singletons.MindStoneSingleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Marvel Stones Universe!");

        final var gauntletService = new GauntletServiceImpl();

        System.out.println("---Singleton---");
        final var singleton1 = MindStoneSingleton.getInstance();
        System.out.println("Singleton 1: " + System.identityHashCode(singleton1));

        final var singleton2 = MindStoneSingleton.getInstance();
        System.out.println("Singleton 2: " + System.identityHashCode(singleton2));

        gauntletService.useGauntlet(singleton1.getName());
        singleton1.usePower();

        System.out.println("---Prototype---");

        final var mind = new MindStone();
        System.out.println("Original: " + mind);
        System.out.println("Original Hash: " + System.identityHashCode(mind));
        mind.usePower();

        final var mindProto = Prototypes.MIND_STONE_PROTOTYPE.buildPrototype(mind);
        System.out.println("Prototype 1: " + mindProto);
        System.out.println("Prototype 1 Hash: " + System.identityHashCode(mindProto));
        mindProto.usePower();

        final var mindProto2 = Prototypes.MIND_STONE_PROTOTYPE.buildPrototype(mind);
        System.out.println("Prototype 2: " + mindProto2);
        System.out.println("Prototype 2 Hash: " + System.identityHashCode(mindProto2));
        mindProto2.usePower();

        System.out.println("Thank you for visiting the Marvel Stones Universe!");
    }
}