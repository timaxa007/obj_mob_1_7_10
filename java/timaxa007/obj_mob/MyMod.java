package timaxa007.obj_mob;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = MyMod.MODID, name = MyMod.NAME, version = MyMod.VERSION)
public class MyMod {

	public static final String
	MODID = "obj_mob",
	NAME = "OBJ Mob",
	VERSION = "0.3.6";

	@Mod.Instance(MODID) public static MyMod instance;

	@SidedProxy(modId = MODID, serverSide = "timaxa007.obj_mob.ProxyServer", clientSide = "timaxa007.obj_mob.ProxyClient")
	public static ProxyServer proxy;

	public static Item item_spawn_mob;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		item_spawn_mob = new ItemSpawnMob().setUnlocalizedName("item_spawn_mob").setMaxDamage(10).setMaxStackSize(1).setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(item_spawn_mob, "item_spawn_mob");

		EntityRegistry.registerModEntity(EntityMyMob.class, "EntityMyMob", 0, MyMod.instance, 80, 3, true);

		proxy.preInit();
	}

}
