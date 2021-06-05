
package net.probie.xiaoyu.creativetab;

import net.probie.xiaoyu.block.BlockXaioyublock;
import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsXiaoyuMod.ModElement.Tag
public class TabXiaoyuxxk extends ElementsXiaoyuMod.ModElement {
	public TabXiaoyuxxk(ElementsXiaoyuMod instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabxiaoyuxxk") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockXaioyublock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
