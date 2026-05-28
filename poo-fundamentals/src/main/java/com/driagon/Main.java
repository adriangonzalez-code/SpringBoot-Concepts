package com.driagon;

import com.driagon.factories.MindStoneFactory;
import com.driagon.factories.PowerStoneFactory;
import com.driagon.factories.RealityStoneFactory;
import com.driagon.factories.SoulStoneFactory;
import com.driagon.factories.SpaceStoneFactory;
import com.driagon.factories.TimeStoneFactory;
import com.driagon.models.MindStone;
import com.driagon.prototypes.Prototypes;
import com.driagon.services.GauntletServiceImpl;
import com.driagon.singletons.MindStoneSingleton;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Welcome to the Marvel Stones Universe!");

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

        System.out.println("Thank you for visiting the Marvel Stones Universe!");*/

        System.setProperty("scope", "prototype");

        /*final var timeStoneFactory = new TimeStoneFactory();
        final var powerStoneFactory = new PowerStoneFactory();
        final var mindStoneFactory = new MindStoneFactory();
        final var spaceStoneFactory = new SpaceStoneFactory();
        final var realityStoneFactory = new RealityStoneFactory();
        final var soulStoneFactory = new SoulStoneFactory();

        final var timeStone = timeStoneFactory.createStone();
        final var powerStone = powerStoneFactory.createStone();
        final var mindStone = mindStoneFactory.createStone();
        final var spaceStone = spaceStoneFactory.createStone();
        final var realityStone = realityStoneFactory.createStone();
        final var soulStone = soulStoneFactory.createStone();

        System.out.println(timeStone);
        System.out.println(powerStone);
        System.out.println(mindStone);
        System.out.println(spaceStone);
        System.out.println(realityStone);
        System.out.println(soulStone);*/

        var realityFactory = new RealityStoneFactory();
        var timeFactory = new TimeStoneFactory();
        var soulFactory = new SoulStoneFactory();
        var powerFactory = new PowerStoneFactory();
        var spaceFactory = new SpaceStoneFactory();
        var mindFactory = new MindStoneFactory();


        // DI by setter
        /*final var gauntletService = new GauntletServiceImpl();

        gauntletService.setReality(realityFactory.createStone());
        gauntletService.setTime(timeFactory.createStone());
        gauntletService.setSoul(soulFactory.createStone());
        gauntletService.setPower(powerFactory.createStone());
        gauntletService.setSpace(spaceFactory.createStone());
        gauntletService.setMind(mindFactory.createStone());*/

        // DI by constructor
        final var gauntletService = new GauntletServiceImpl(realityFactory.createStone(), mindFactory.createStone(), powerFactory.createStone(), spaceFactory.createStone(), timeFactory.createStone(), soulFactory.createStone());

        gauntletService.useGauntlet("reality");
        gauntletService.useFullPower();
    }
}