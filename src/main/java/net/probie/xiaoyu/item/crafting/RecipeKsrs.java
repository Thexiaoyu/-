
package net.probie.xiaoyu.item.crafting;

import net.probie.xiaoyu.item.ItemXxzz;
import net.probie.xiaoyu.block.BlockYukuang;
import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsXiaoyuMod.ModElement.Tag
public class RecipeKsrs extends ElementsXiaoyuMod.ModElement {
	public RecipeKsrs(ElementsXiaoyuMod instance) {
		super(instance, 24);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockYukuang.block, (int) (1)), new ItemStack(ItemXxzz.block, (int) (1)), 3F);
	}
}
