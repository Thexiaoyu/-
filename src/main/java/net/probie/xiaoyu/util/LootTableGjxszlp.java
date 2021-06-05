
package net.probie.xiaoyu.util;

import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

@ElementsXiaoyuMod.ModElement.Tag
public class LootTableGjxszlp extends ElementsXiaoyuMod.ModElement {
	public LootTableGjxszlp(ElementsXiaoyuMod instance) {
		super(instance, 30);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("xiaoyu", "gjxszp"));
	}
}
