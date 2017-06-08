package timaxa007.obj_mob;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ProxyClient extends ProxyServer {

	@Override
	public void preInit() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMyMob.class, new RenderEntityMyMob());
	}

}
