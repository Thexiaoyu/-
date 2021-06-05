
package net.probie.xiaoyu.block;

import net.probie.xiaoyu.creativetab.TabTuanDuiTouXiang;
import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@ElementsXiaoyuMod.ModElement.Tag
public class BlockXiaoYudada extends ElementsXiaoyuMod.ModElement {
	@GameRegistry.ObjectHolder("xiaoyu:xiao_yudada")
	public static final Block block = null;
	public BlockXiaoYudada(ElementsXiaoyuMod instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("xiao_yudada"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("xiaoyu:xiao_yudada", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setUnlocalizedName("xiao_yudada");
			setSoundType(SoundType.GLASS);
			setHardness(0F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabTuanDuiTouXiang.tab);
		}
	}
}
