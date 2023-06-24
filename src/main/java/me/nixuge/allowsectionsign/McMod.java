package me.nixuge.allowsectionsign;

import lombok.Getter;
import lombok.Setter;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = McMod.MOD_ID,
        name = McMod.NAME,
        version = McMod.VERSION,
        clientSideOnly = true
)

@Setter
public class McMod {
    public static final String MOD_ID = "allowsectionsign";
    public static final String NAME = "Allow Section Sign";
    public static final String VERSION = "1.0.0";


    @Getter
    @Mod.Instance(value = McMod.MOD_ID)
    private static McMod instance;
}
