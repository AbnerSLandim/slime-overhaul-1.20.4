package net.joykyo.slimeoverhaul.entity.client;

import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.joykyo.slimeoverhaul.entity.custom.IceSlimeEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class IceSlimeRenderer extends MobEntityRenderer<IceSlimeEntity, IceSlimeModel<IceSlimeEntity>> {

    private static final Identifier TEXTURE = new Identifier(SlimeOverhaul.MOD_ID, "textures/entity/neve.png");
    public IceSlimeRenderer(EntityRendererFactory.Context context) {
        super(context, new IceSlimeModel<>(context.getPart(ModModelLayers.ICE_SLIME)), 1f);
    }

    @Override
    public Identifier getTexture(IceSlimeEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(IceSlimeEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {

        float tamanho = mobEntity.getSize();


        if (tamanho != 0){
            matrixStack.scale(tamanho , tamanho, tamanho);

        }


        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);


    }
}







































