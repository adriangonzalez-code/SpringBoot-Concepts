package com.driagon;

import com.driagon.configs.StoneConfig;
import com.driagon.factories.MindStoneFactory;
import com.driagon.factories.PowerStoneFactory;
import com.driagon.factories.RealityStoneFactory;
import com.driagon.factories.SoulStoneFactory;
import com.driagon.factories.SpaceStoneFactory;
import com.driagon.factories.TimeStoneFactory;
import com.driagon.models.*;
import com.driagon.prototypes.Prototypes;
import com.driagon.services.GauntletServiceImpl;
import com.driagon.singletons.MindStoneSingleton;

import java.util.Map;

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

        // Set scope
        /*System.setProperty("scope", "singleton");

        final var timeFactory = new TimeStoneFactory();
        final var powerFactory = new PowerStoneFactory();
        final var mindFactory = new MindStoneFactory();
        final var spaceFactory = new SpaceStoneFactory();
        final var realityFactory = new RealityStoneFactory();
        final var soulFactory = new SoulStoneFactory();

        final TimeStone time = (TimeStone) timeFactory.createStone();
        final PowerStone power = (PowerStone) powerFactory.createStone();
        final MindStone mind = (MindStone) mindFactory.createStone();
        final SpaceStone space = (SpaceStone) spaceFactory.createStone();
        final RealityStone reality = (RealityStone) realityFactory.createStone();
        final SoulStone soul = (SoulStone) soulFactory.createStone();

        Map<String, AbstractStone> instances = Map.of(
                "time", time,
                "power", power,
                "mind", mind,
                "space", space,
                "reality", reality,
                "soul", soul
        );*/

       /* var realityFactory = new RealityStoneFactory();
        var timeFactory = new TimeStoneFactory();
        var soulFactory = new SoulStoneFactory();
        var powerFactory = new PowerStoneFactory();
        var spaceFactory = new SpaceStoneFactory();
        var mindFactory = new MindStoneFactory();*/


        // DI by setter
        /*final var gauntletService = new GauntletServiceImpl();

        gauntletService.setReality(realityFactory.createStone());
        gauntletService.setTime(timeFactory.createStone());
        gauntletService.setSoul(soulFactory.createStone());
        gauntletService.setPower(powerFactory.createStone());
        gauntletService.setSpace(spaceFactory.createStone());
        gauntletService.setMind(mindFactory.createStone());*/

        // DI by constructor
        //final var gauntletService = new GauntletServiceImpl(reality, mind, power, space, time, soul);

        // DI by field
        //final var gauntletService = new GauntletServiceImpl();
        //gauntletService.setStones(instances);

       /* gauntletService.useGauntlet("power");
        gauntletService.useGauntlet("mind");
        gauntletService.useFullPower();*/

        final var gauntletService = StoneConfig.setContext(pre -> System.out.println("Do something 1"), post -> System.out.println("Do something 2"));

        gauntletService.useGauntlet("power");
        gauntletService.useFullPower();

        StoneConfig.destroyContext(gauntletService);
    }
}