package net.probie.xiaoyu.procedure;

import net.probie.xiaoyu.gui.GuiPlayergui;
import net.probie.xiaoyu.XiaoyuMod;
import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsXiaoyuMod.ModElement.Tag
public class ProcedureZbcdopen extends ElementsXiaoyuMod.ModElement {
	public ProcedureZbcdopen(ElementsXiaoyuMod instance) {
		super(instance, 47);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Zbcdopen!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Zbcdopen!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Zbcdopen!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Zbcdopen!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Zbcdopen!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(XiaoyuMod.instance, GuiPlayergui.GUIID, world, x, y, z);
	}
}
