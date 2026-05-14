package com.driagon.prototypes;

import com.driagon.models.AbstractStone;

@FunctionalInterface
public interface StonePrototype<S extends AbstractStone> {

    S buildPrototype(S stone);
}