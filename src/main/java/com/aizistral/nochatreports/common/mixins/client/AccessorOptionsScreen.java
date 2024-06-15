package com.aizistral.nochatreports.common.mixins.client;

import net.minecraft.client.gui.screens.options.OptionsScreen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(OptionsScreen.class)
public interface AccessorOptionsScreen {
    @Accessor("TELEMETRY")
    public static Component getTelemetryComponent() {
        throw new IllegalStateException("Nope!");
    }
}
