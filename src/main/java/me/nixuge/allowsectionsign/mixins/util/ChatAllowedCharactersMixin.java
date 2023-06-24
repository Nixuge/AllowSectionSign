package me.nixuge.allowsectionsign.mixins.util;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.util.ChatAllowedCharacters;

// Note: class named "CHATallowedchars"
// but actually used in every GUI
@Mixin(ChatAllowedCharacters.class)
public class ChatAllowedCharactersMixin {
    @Overwrite
    public static boolean isAllowedCharacter(char character) {
        // Vanilla checks - the section sign one (167)
        System.out.println("CALLED");
        return character >= 32 && character != 127;
    }
}
