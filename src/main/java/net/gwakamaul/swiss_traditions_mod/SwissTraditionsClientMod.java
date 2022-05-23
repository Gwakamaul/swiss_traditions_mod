package net.gwakamaul.swiss_traditions_mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.gwakamaul.swiss_traditions_mod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class SwissTraditionsClientMod implements ClientModInitializer {

    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EDELWEISS_FLOWER, RenderLayer.getCutout());
    }
}
