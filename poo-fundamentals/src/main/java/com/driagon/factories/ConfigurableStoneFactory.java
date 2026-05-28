package com.driagon.factories;

import com.driagon.models.AbstractStone;
import lombok.extern.java.Log;

import java.util.Optional;

@Log
public abstract class ConfigurableStoneFactory {

    public abstract AbstractStone createStone();

    protected boolean isSingleton() {
        final var scopeOpt = Optional.ofNullable(System.getProperty("scope"));
        final var scope = scopeOpt.orElse("singleton");

        log.info("Checking if factory is singleton with scope: " + scope);
        return "singleton".equalsIgnoreCase(scope);
    }
}