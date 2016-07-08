package com.rocker1337.dab.events;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * Created by Rocker545 on 7/3/2016.
 */
public class Gamerules {

    public static class GameRule {
        public static final String DISABLE_WEATHER = "disableWeather";
        public static final String ALLOW_CHEATS = "allowCheats";

    }

    public static void addRule(GameRules rules, String name, String defaultValue) {
        if (!rules.hasRule(name)) rules.addGameRule(name, defaultValue, GameRules.ValueType.BOOLEAN_VALUE);
    }

    public void WorldInfo(TickEvent.WorldTickEvent event)
    {
        World world = event.world;
        WorldInfo worldInfo = world.getWorldInfo();

        Boolean a = worldInfo.areCommandsAllowed();
        String astr = String.valueOf(a);
    }

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load evt) {
        final GameRules rules = evt.getWorld().getGameRules();


        addRule(rules, GameRule.DISABLE_WEATHER, "false");
        addRule(rules, GameRule.ALLOW_CHEATS, );
    }
}
