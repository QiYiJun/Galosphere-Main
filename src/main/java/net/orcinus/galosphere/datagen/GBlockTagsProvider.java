package net.orcinus.galosphere.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.orcinus.galosphere.Galosphere;
import net.orcinus.galosphere.compat.init.ForgeBlockTags;
import net.orcinus.galosphere.init.GBlockTags;
import net.orcinus.galosphere.init.GBlocks;
import org.jetbrains.annotations.Nullable;

public class GBlockTagsProvider extends BlockTagsProvider {

    public GBlockTagsProvider(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, Galosphere.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(GBlocks.SILVER_ORE.get(), GBlocks.SILVER_BLOCK.get(), GBlocks.DEEPSLATE_SILVER_ORE.get(), GBlocks.AMETHYST_SLAB.get(), GBlocks.AMETHYST_STAIRS.get(), GBlocks.ALLURITE_BLOCK.get(), GBlocks.ALLURITE_SLAB.get(), GBlocks.ALLURITE_STAIRS.get(), GBlocks.LUMIERE_BLOCK.get(), GBlocks.LUMIERE_SLAB.get(), GBlocks.LUMIERE_STAIRS.get(), GBlocks.SMOOTH_AMETHYST.get(), GBlocks.SMOOTH_AMETHYST_SLAB.get(), GBlocks.SMOOTH_AMETHYST_STAIRS.get(), GBlocks.AMETHYST_BRICKS.get(), GBlocks.AMETHYST_BRICK_SLAB.get(), GBlocks.AMETHYST_BRICK_STAIRS.get(), GBlocks.CHISELED_AMETHYST.get(), GBlocks.SMOOTH_ALLURITE.get(), GBlocks.SMOOTH_ALLURITE_SLAB.get(), GBlocks.SMOOTH_ALLURITE_STAIRS.get(), GBlocks.ALLURITE_BRICKS.get(), GBlocks.ALLURITE_BRICK_SLAB.get(), GBlocks.ALLURITE_BRICK_STAIRS.get(), GBlocks.CHISELED_ALLURITE.get(), GBlocks.SMOOTH_LUMIERE.get(), GBlocks.SMOOTH_LUMIERE_SLAB.get(), GBlocks.SMOOTH_LUMIERE_STAIRS.get(), GBlocks.LUMIERE_BRICKS.get(), GBlocks.LUMIERE_BRICK_SLAB.get(), GBlocks.LUMIERE_BRICK_STAIRS.get(), GBlocks.CHISELED_LUMIERE.get(), GBlocks.AURA_RINGER.get(), GBlocks.WARPED_ANCHOR.get(), GBlocks.ALLURITE_CLUSTER.get(), GBlocks.LUMIERE_CLUSTER.get(), GBlocks.RAW_SILVER_BLOCK.get(), GBlocks.COMBUSTION_TABLE.get(), GBlocks.CHARGED_LUMIERE_BLOCK.get(), GBlocks.AMETHYST_LAMP.get(), GBlocks.ALLURITE_LAMP.get(), GBlocks.LUMIERE_LAMP.get(), GBlocks.CHANDELIER.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(GBlocks.LUMIERE_COMPOSTER.get());
        this.tag(BlockTags.MINEABLE_WITH_HOE).add(GBlocks.LICHEN_MOSS.get());
        this.tag(BlockTags.BEACON_BASE_BLOCKS).add(GBlocks.SILVER_BLOCK.get());
        this.tag(BlockTags.CRYSTAL_SOUND_BLOCKS).add(GBlocks.AMETHYST_SLAB.get(), GBlocks.AMETHYST_STAIRS.get(), GBlocks.SMOOTH_AMETHYST.get(), GBlocks.SMOOTH_AMETHYST_SLAB.get(), GBlocks.SMOOTH_AMETHYST_STAIRS.get(), GBlocks.SMOOTH_ALLURITE.get(), GBlocks.SMOOTH_ALLURITE_SLAB.get(), GBlocks.SMOOTH_ALLURITE_STAIRS.get(), GBlocks.SMOOTH_LUMIERE.get(), GBlocks.SMOOTH_LUMIERE_SLAB.get(), GBlocks.SMOOTH_LUMIERE_STAIRS.get(), GBlocks.AMETHYST_BRICKS.get(), GBlocks.AMETHYST_BRICK_SLAB.get(), GBlocks.AMETHYST_BRICK_STAIRS.get(), GBlocks.ALLURITE_BRICKS.get(), GBlocks.ALLURITE_BRICK_SLAB.get(), GBlocks.ALLURITE_BRICK_STAIRS.get(), GBlocks.LUMIERE_BRICKS.get(), GBlocks.LUMIERE_BRICK_SLAB.get(), GBlocks.LUMIERE_BRICK_STAIRS.get(), GBlocks.ALLURITE_BLOCK.get(), GBlocks.LUMIERE_BLOCK.get());
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(GBlocks.SILVER_ORE.get(), GBlocks.DEEPSLATE_SILVER_ORE.get(), GBlocks.RAW_SILVER_BLOCK.get(), GBlocks.SILVER_BLOCK.get(), GBlocks.AURA_RINGER.get(), GBlocks.WARPED_ANCHOR.get(), GBlocks.COMBUSTION_TABLE.get());
        this.tag(BlockTags.STAIRS).add(GBlocks.AMETHYST_STAIRS.get(), GBlocks.ALLURITE_STAIRS.get(), GBlocks.LUMIERE_STAIRS.get(), GBlocks.SMOOTH_AMETHYST_STAIRS.get(), GBlocks.SMOOTH_ALLURITE_STAIRS.get(), GBlocks.SMOOTH_LUMIERE_STAIRS.get(), GBlocks.AMETHYST_BRICK_STAIRS.get(), GBlocks.ALLURITE_BRICK_STAIRS.get(), GBlocks.LUMIERE_BRICK_STAIRS.get());
        this.tag(BlockTags.SLABS).add(GBlocks.AMETHYST_SLAB.get(), GBlocks.ALLURITE_SLAB.get(), GBlocks.LUMIERE_SLAB.get(), GBlocks.SMOOTH_AMETHYST_SLAB.get(), GBlocks.SMOOTH_ALLURITE_SLAB.get(), GBlocks.SMOOTH_LUMIERE_SLAB.get(), GBlocks.AMETHYST_BRICK_SLAB.get(), GBlocks.ALLURITE_BRICK_SLAB.get(), GBlocks.LUMIERE_BRICK_SLAB.get());
        this.tag(BlockTags.DIRT).add(GBlocks.LICHEN_MOSS.get());

        this.tag(GBlockTags.CRYSTAL_SPIKES_BLOCKS).add(GBlocks.ALLURITE_BLOCK.get(), GBlocks.LUMIERE_BLOCK.get());
        this.tag(GBlockTags.SPARKLES_SPAWNABLE_ON).add(Blocks.CALCITE).addTags(BlockTags.BASE_STONE_OVERWORLD, GBlockTags.CRYSTAL_SPIKES_BLOCKS);

        this.tag(ForgeBlockTags.SILVER_ORE).add(GBlocks.SILVER_ORE.get(), GBlocks.DEEPSLATE_SILVER_ORE.get());
        this.tag(ForgeBlockTags.SILVER_STORAGE_BLOCKS).add(GBlocks.SILVER_BLOCK.get());
        this.tag(Tags.Blocks.ORES).addTag(ForgeBlockTags.SILVER_ORE);
        this.tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ForgeBlockTags.SILVER_STORAGE_BLOCKS);
    }
}
