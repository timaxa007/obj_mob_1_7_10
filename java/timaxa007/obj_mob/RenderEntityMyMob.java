package timaxa007.obj_mob;

import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMyMob extends RenderBiped {

	public static final ResourceLocation
	texture = new ResourceLocation(MyMod.MODID, "textures/model/mob/my_skin2.png");

	public RenderEntityMyMob() {
		super(new ModelMyMob(), 0.5F);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityLiving entity) {
		return texture;
	}

}
