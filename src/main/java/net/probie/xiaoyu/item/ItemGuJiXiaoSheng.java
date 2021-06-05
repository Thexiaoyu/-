
package net.probie.xiaoyu.item;

import net.probie.xiaoyu.creativetab.TabXiaoyuxxk;
import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsXiaoyuMod.ModElement.Tag
public class ItemGuJiXiaoSheng extends ElementsXiaoyuMod.ModElement {
	@GameRegistry.ObjectHolder("xiaoyu:gu_ji_xiao_sheng")
	public static final Item block = null;
	public ItemGuJiXiaoSheng(ElementsXiaoyuMod instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("xiaoyu:gu_ji_xiao_sheng", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("gu_ji_xiao_sheng", ElementsXiaoyuMod.sounds.get(new ResourceLocation("xiaoyu:guajixiaosheng")));
			setUnlocalizedName("gu_ji_xiao_sheng");
			setRegistryName("gu_ji_xiao_sheng");
			setCreativeTab(TabXiaoyuxxk.tab);
		}
	}
}
