package net.joykyo.slimeoverhaul.block.custom;

import com.mojang.serialization.MapCodec;
import net.joykyo.slimeoverhaul.block.entity.MailboxBlockEntity;
import net.joykyo.slimeoverhaul.block.entity.ModBlockEntities;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MailboxBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape SHAPE = BlockWithEntity.createCuboidShape(0, 0, 0,2 , 18, 2);
    public MailboxBlock(Settings settings){
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return null;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new MailboxBlockEntity(pos, state);
    }
    //Caso o bloco seja destruido o inventario dele dropa no chão
    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if(state.getBlock() != newState.getBlock()){
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof MailboxBlockEntity){
                ItemScatterer.spawn(world,pos,(MailboxBlockEntity) blockEntity);
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state,world,pos,newState,moved);
        }
    }
    //abre o menu mailbox se tudo certo
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient){
            NamedScreenHandlerFactory screenHandlerFactory = ((MailboxBlockEntity) world.getBlockEntity(pos));

            if (screenHandlerFactory != null){
                player.openHandledScreen(screenHandlerFactory);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(type, ModBlockEntities.MAILBOX_BLOCK_ENTITY_BLOCK_ENTITY_TYPE,
                ((world1, pos, state1, blockEntity) -> blockEntity.tick(world1,pos,state1)));
    }
}












