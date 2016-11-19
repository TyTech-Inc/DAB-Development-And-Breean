package com.rocker1337.dab.events;

import com.rocker1337.dab.ConfigHandler;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by drkpa on 11/15/2016.
 */
public class TerrainEventHandler {

    @SubscribeEvent(receiveCanceled = true)
    public void onDecorateEvent(DecorateBiomeEvent.Decorate event)
    {

        if(event.getType() == DecorateBiomeEvent.Decorate.EventType.GRASS && !ConfigHandler.noTallGrass)
        {
            event.setResult(Event.Result.DENY);
        }
    }
}