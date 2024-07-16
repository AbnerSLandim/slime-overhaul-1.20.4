// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.joykyo.slimeoverhaul.entity.client;

import net.joykyo.slimeoverhaul.entity.custom.IceSlimeEntity;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
public class IceSlimeModel<T extends IceSlimeEntity> extends SinglePartEntityModel<T> {
	private final ModelPart ice_slime;

	public IceSlimeModel(ModelPart root) {
		this.ice_slime = root.getChild("ice_slime");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData ice_slime = modelPartData.addChild("ice_slime", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData nucleo = ice_slime.addChild("nucleo", ModelPartBuilder.create().uv(0, 16).cuboid(-3.0F, -7.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData gelatina = ice_slime.addChild("gelatina", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData neve = ice_slime.addChild("neve", ModelPartBuilder.create().uv(0, 28).cuboid(-4.0F, -7.0F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.01F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData gelo = ice_slime.addChild("gelo", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = gelo.addChild("cube_r1", ModelPartBuilder.create().uv(0, 40).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.4F, -7.0F, 1.0F, -0.2848F, 0.5214F, 0.5543F));

		ModelPartData cube_r2 = gelo.addChild("cube_r2", ModelPartBuilder.create().uv(0, 40).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.7F, -3.0F, -1.2622F, 0.3113F, 0.7256F));

		ModelPartData cube_r3 = gelo.addChild("cube_r3", ModelPartBuilder.create().uv(0, 40).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -7.3F, -0.8F, -0.983F, 0.5214F, 0.5543F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(IceSlimeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		ice_slime.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return ice_slime;
	}
}