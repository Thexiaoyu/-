
package net.probie.xiaoyu.item;

import net.probie.xiaoyu.creativetab.TabXiaoyuxxk;
import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsXiaoyuMod.ModElement.Tag
public class ItemGuajiskin extends ElementsXiaoyuMod.ModElement {
	@GameRegistry.ObjectHolder("xiaoyu:guajiskinhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("xiaoyu:guajiskinbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("xiaoyu:guajiskinlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("xiaoyu:guajiskinboots")
	public static final Item boots = null;
	public ItemGuajiskin(ElementsXiaoyuMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GUAJISKIN", "xiaoyu:gu_ji_", 65, new int[]{2, 5, 6, 5}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("guajiskinhelmet")
				.setRegistryName("guajiskinhelmet").setCreativeTab(TabXiaoyuxxk.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("guajiskinbody")
				.setRegistryName("guajiskinbody").setCreativeTab(TabXiaoyuxxk.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("guajiskinlegs")
				.setRegistryName("guajiskinlegs").setCreativeTab(TabXiaoyuxxk.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("guajiskinboots")
				.setRegistryName("guajiskinboots").setCreativeTab(TabXiaoyuxxk.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("xiaoyu:guajiskinhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("xiaoyu:guajiskinbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("xiaoyu:guajiskinlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("xiaoyu:guajiskinboots", "inventory"));
	}
}
