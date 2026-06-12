package com.driagon.configs;

import com.driagon.factories.*;
import com.driagon.models.*;
import com.driagon.services.GauntletService;
import com.driagon.services.GauntletServiceImpl;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.util.Map;
import java.util.function.Consumer;

// IoC
@Log
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class StoneConfig {

    public static GauntletService setContext(Consumer<Void> preConstruct, Consumer<Void> postConstruct) {
        log.info("IoC set Scope");
        System.setProperty("scope", "singleton");

        // @PreConstruct
        log.info("PreConstruct: Setting up the context before constructing the GauntletService");
        preConstruct.accept(null);

        // IoC
        log.info("IoC: Constructing the GauntletService with the configured factories");
        var realityFactory = new RealityStoneFactory();
        var timeFactory = new TimeStoneFactory();
        var soulFactory = new SoulStoneFactory();
        var powerFactory = new PowerStoneFactory();
        var spaceFactory = new SpaceStoneFactory();
        var mindFactory = new MindStoneFactory();

        log.info("IoC instance objects");
        RealityStone reality = (RealityStone) realityFactory.createStone();
        TimeStone time = (TimeStone) timeFactory.createStone();
        SoulStone soul = (SoulStone) soulFactory.createStone();
        PowerStone power = (PowerStone) powerFactory.createStone();
        SpaceStone space = (SpaceStone) spaceFactory.createStone();
        MindStone mind = (MindStone) mindFactory.createStone();

        log.info("IoC loading GauntletServiceImpl in container");
        final var gauntletService = new GauntletServiceImpl();

        Map<String, AbstractStone> instances = Map.of(
                "reality", reality,
                "time", time,
                "soul", soul,
                "power", power,
                "space", space,
                "mind", mind
        );

        log.info("IoC DI");
        gauntletService.setStones(instances);

        log.info("IoC executing PostConstruct");
        // @PostConstruct
        postConstruct.accept(null);

        return gauntletService;
    }

    public static void destroyContext(GauntletService gauntletService) {
        log.info("Cleaning context");

        if (gauntletService instanceof GauntletServiceImpl) {
            log.info("Destroying the GauntletService");
            ((GauntletServiceImpl) gauntletService).getMind().clear();
            ((GauntletServiceImpl) gauntletService).getReality().clear();
            ((GauntletServiceImpl) gauntletService).getPower().clear();
            ((GauntletServiceImpl) gauntletService).getSpace().clear();
            ((GauntletServiceImpl) gauntletService).getTime().clear();
            ((GauntletServiceImpl) gauntletService).getSoul().clear();
        }

        log.info("Cleaning property");
        System.clearProperty("scope");
    }
}