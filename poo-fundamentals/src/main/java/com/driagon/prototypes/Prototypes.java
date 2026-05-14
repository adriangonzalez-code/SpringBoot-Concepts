package com.driagon.prototypes;

import com.driagon.models.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Prototypes {

    public static final StonePrototype<MindStone> MIND_STONE_PROTOTYPE = MindStone::getPrototype;

    public static final StonePrototype<PowerStone> POWER_STONE_PROTOTYPE = PowerStone::getPrototype;

    public static final StonePrototype<RealityStone> REALITY_STONE_PROTOTYPE = RealityStone::getPrototype;

    public static final StonePrototype<SoulStone> SOUL_STONE_PROTOTYPE = SoulStone::getPrototype;

    public static final StonePrototype<SpaceStone> SPACE_STONE_PROTOTYPE = SpaceStone::getPrototype;

    public static final StonePrototype<TimeStone> TIME_STONE_PROTOTYPE = TimeStone::getPrototype;
}