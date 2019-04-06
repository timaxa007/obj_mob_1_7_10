package timaxa007.obj_mob;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import timaxa007.test_armor_obj.ArmorCustomModel;

@SideOnly(Side.CLIENT)
public class ModelMyMob extends ArmorCustomModel {

	public ModelMyMob() {
		bipedHead.showModel =
				bipedHeadwear.showModel =
				bipedBody.showModel =
				bipedRightArm.showModel =
				bipedLeftArm.showModel =
				bipedRightLeg.showModel =
				bipedLeftLeg.showModel =
				bipedEars.showModel =
				bipedCloak.showModel =
				false;

	}

	@Override
	public void pre() {

	}

	@Override
	public void post() {

	}

	@Override
	public void partHead() {
		GL11.glTranslatef(0F, -1.5F, 0F);
		GL11.glCallList(ProxyClient.displayList[0]);
	}

	@Override
	public void partBody() {
		GL11.glTranslatef(0F, -1.5F, 0F);
		GL11.glCallList(ProxyClient.displayList[1]);
	}

	@Override
	public void partRightArm() {
		GL11.glTranslatef(0.3125F, -1.375F, 0F);
		GL11.glCallList(ProxyClient.displayList[2]);
	}

	@Override
	public void partLeftArm() {
		GL11.glTranslatef(-0.3125F, -1.375F, 0F);
		GL11.glCallList(ProxyClient.displayList[3]);
	}

	@Override
	public void partRightLeg() {
		GL11.glTranslatef(0.125F, -0.75F, 0F);
		GL11.glCallList(ProxyClient.displayList[4]);
	}

	@Override
	public void partLeftLeg() {
		GL11.glTranslatef(-0.125F, -0.75F, 0F);
		GL11.glCallList(ProxyClient.displayList[5]);
	}

}
