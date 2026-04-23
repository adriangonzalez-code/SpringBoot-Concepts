package com.driagon;

import com.driagon.models.AbstractStone;
import com.driagon.models.MindStone;
import com.driagon.models.PowerStone;
import com.driagon.models.RealityStone;
import com.driagon.models.SoulStone;
import com.driagon.models.SpaceStone;
import com.driagon.models.TimeStone;
import com.driagon.services.GauntletServiceImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Marvel Stones Universe!");

        final var gauntlet = new GauntletServiceImpl();
        gauntlet.useGauntlet("Reality");
        gauntlet.useGauntlet("Mind");
        gauntlet.useGauntlet("Power");
        gauntlet.useGauntlet("Soul");
        gauntlet.useGauntlet("Time");
        gauntlet.useGauntlet("Space");

        System.out.println("Thank you for visiting the Marvel Stones Universe!");
    }
}