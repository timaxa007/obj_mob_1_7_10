package timaxa007.obj_mob;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ProxyClient extends ProxyServer {

	public static int[] displayList = new int[6];//for 6 parts model

	@Override
	public void preInit() {

		final IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation(MyMod.MODID, "model/mob/ugly_biper.obj"));
		//ModelRenderer.compileDisplayList(float)
		final String[] partsName = new String[] {
				"head",			//1
				"body",			//2
				"right_arm",	//3
				"left_arm",		//4
				"right_leg",	//5
				"left_leg"		//6
		};
		for (int i = 0; i < displayList.length; ++i ) {
			displayList[i] = GLAllocation.generateDisplayLists(1);
			GL11.glNewList(displayList[i], GL11.GL_COMPILE);
			model.renderPart(partsName[i]);
			GL11.glEndList();
		}

		RenderingRegistry.registerEntityRenderingHandler(EntityMyMob.class, new RenderEntityMyMob());
	}

}
