
package net.probie.xiaoyu.creativetab;

import net.probie.xiaoyu.block.BlockTdztx;
import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsXiaoyuMod.ModElement.Tag
public class TabTuanDuiTouXiang extends ElementsXiaoyuMod.ModElement {
	public TabTuanDuiTouXiang(ElementsXiaoyuMod instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtuan_dui_tou_xiang") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockTdztx.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
