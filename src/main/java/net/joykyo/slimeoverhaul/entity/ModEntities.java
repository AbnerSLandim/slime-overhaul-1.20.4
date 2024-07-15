package net.joykyo.slimeoverhaul.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.joykyo.slimeoverhaul.entity.custom.IceSlimeEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<IceSlimeEntity> ICE_SLIME = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(SlimeOverhaul.MOD_ID, "ice_slime"),
            EntityType.Builder.create(IceSlimeEntity::new, SpawnGroup.MONSTER )
                    .setDimensions(2f, 2f).build());


    public static void registerModEntities(){
        SlimeOverhaul.LOGGER.info("Registering Entities for " + SlimeOverhaul.MOD_ID);
    }

}




















