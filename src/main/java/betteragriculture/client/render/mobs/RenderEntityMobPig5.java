package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobPig5;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig5 extends RenderLiving<EntityMobPig5>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig5.png");

	public RenderEntityMobPig5(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig5 entity)
	{
		return textures;
	}
}