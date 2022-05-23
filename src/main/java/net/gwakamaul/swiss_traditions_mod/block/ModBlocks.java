package net.gwakamaul.swiss_traditions_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gwakamaul.swiss_traditions_mod.SwissTraditionsMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BLOCK_EXAMPLE = registerBlock("block_example",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.MISC);

    public static final Block EDELWEISS_FLOWER = registerBlock("edelweiss_flower",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.DANDELION).strength(6f)), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {

        registerModBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(SwissTraditionsMod.MOD_ID, name), block);

    }

    private static Item registerModBlockItem(String name, Block block, ItemGroup group) {

        return Registry.register(Registry.ITEM, new Identifier(SwissTraditionsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));

    }

    public static void registerModBlocks() {

        SwissTraditionsMod.LOGGER.info("Registering ModBlocks for" + SwissTraditionsMod.MOD_ID);

    }
}
