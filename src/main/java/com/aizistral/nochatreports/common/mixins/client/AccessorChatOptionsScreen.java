package com.aizistral.nochatreports.common.mixins.client;

import net.minecraft.client.gui.screens.options.ChatOptionsScreen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ChatOptionsScreen.class)
public interface AccessorChatOptionsScreen {
    @Accessor("TITLE")
    public static Component getTitleComponent() {
        throw new IllegalStateException("Nope!");
    }
}
