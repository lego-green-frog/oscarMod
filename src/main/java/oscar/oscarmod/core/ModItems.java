package oscar.oscarmod.core;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import oscar.oscarmod.OscarMod;

/**
 * Copyright Geoverlay Ltd. 2023
 * User: colt
 * Date: 09/09/2023
 */
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OscarMod.MOD_ID);

    public static final RegistryObject<Item> MOD_BLOCK = ITEMS.register("mod_block", () -> new BlockItem(ModBlocks.MOD_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

}
