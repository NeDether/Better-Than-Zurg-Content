package io.github.nedether.btz;

import io.github.nedether.btz.reg.itemReg;
import io.github.nedether.btz.reg.blockReg;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterThanZurg.MODID)
public class BetterThanZurg {
    public static final String MODID = "btz";

    public BetterThanZurg() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        itemReg.ITEMS.register(bus);
        blockReg.BLOCKS.register(bus);

    }
}
