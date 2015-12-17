package net.uk.moon.simplemod;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.uk.moon.simplemod.proxy.Proxy;

@Mod(modid = SimpleMod.MOD_ID, version = SimpleMod.VERSION)
public class SimpleMod
{
    public static final String MOD_ID = "simplemod";
    public static final String VERSION = "0.1.0";

    @Instance(SimpleMod.MOD_ID)
    public static SimpleMod instance;

    @SidedProxy(clientSide = "net.uk.moon.simplemod.proxy.ClientProxy", serverSide = "net.uk.moon.simplemod.proxy.ServerProxy")
    public Proxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
