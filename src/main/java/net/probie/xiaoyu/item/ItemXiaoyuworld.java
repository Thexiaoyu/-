
package net.probie.xiaoyu.item;

import net.probie.xiaoyu.world.WorldXiaoyuworld;
import net.probie.xiaoyu.creativetab.TabXiaoyuxxk;

import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;

public class ItemXiaoyuworld extends Item {
	@GameRegistry.ObjectHolder("xiaoyu:xiaoyuworld")
	public static final Item block = null;
	public ItemXiaoyuworld() {
		super();
		this.maxStackSize = 1;
		setMaxDamage(64);
		setCreativeTab(TabXiaoyuxxk.tab);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		pos = pos.offset(facing);
		ItemStack itemstack = entity.getHeldItem(hand);
		if (!entity.canPlayerEdit(pos, facing, itemstack)) {
			return EnumActionResult.FAIL;
		} else {
			if (world.isAirBlock(pos))
				WorldXiaoyuworld.portal.portalSpawn(world, pos);
			itemstack.damageItem(1, entity);
			return EnumActionResult.SUCCESS;
		}
	}
}
