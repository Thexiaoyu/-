
package net.probie.xiaoyu.fuel;

import net.probie.xiaoyu.item.ItemYuGun;
import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraft.item.ItemStack;

@ElementsXiaoyuMod.ModElement.Tag
public class FuelYongHengRanLiao extends ElementsXiaoyuMod.ModElement {
	public FuelYongHengRanLiao(ElementsXiaoyuMod instance) {
		super(instance, 25);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemYuGun.block, (int) (1)).getItem())
			return 999999999;
		return 0;
	}
}
