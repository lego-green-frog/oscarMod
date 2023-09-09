package oscar.oscarmod.core;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import oscar.oscarmod.OscarMod;
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OscarMod.MOD_ID);
public static final RegistryObject<Block> MOD_BLOCK = BLOCKS.register("mod_block", () -> new Block (BlockBehaviour.Properties.of(Material.STONE)));
}
