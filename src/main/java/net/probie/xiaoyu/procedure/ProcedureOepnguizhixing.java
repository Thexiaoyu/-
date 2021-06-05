package net.probie.xiaoyu.procedure;

import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Map;

@ElementsXiaoyuMod.ModElement.Tag
public class ProcedureOepnguizhixing extends ElementsXiaoyuMod.ModElement {
	public ProcedureOepnguizhixing(ElementsXiaoyuMod instance) {
		super(instance, 49);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Oepnguizhixing!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Oepnguizhixing!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Oepnguizhixing!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Oepnguizhixing!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.chicken.egg")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
	}
}
