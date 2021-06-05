package net.probie.xiaoyu.procedure;

import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsXiaoyuMod.ModElement.Tag
public class ProcedureKqfx extends ElementsXiaoyuMod.ModElement {
	public ProcedureKqfx(ElementsXiaoyuMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Kqfx!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).capabilities.allowFlying = (true);
			((EntityPlayer) entity).sendPlayerAbilities();
		}
	}
}
