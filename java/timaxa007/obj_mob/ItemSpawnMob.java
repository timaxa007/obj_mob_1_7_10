package timaxa007.obj_mob;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSpawnMob extends Item {

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		EntityMyMob entity = new EntityMyMob(world);
		entity.setPosition((double)x + 0.5D, (double)y + 1.5D, (double)z + 0.5D);
		if (!world.isRemote) world.spawnEntityInWorld(entity);
		return true;
	}

}
