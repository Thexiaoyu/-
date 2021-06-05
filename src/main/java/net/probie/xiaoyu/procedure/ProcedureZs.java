package net.probie.xiaoyu.procedure;

import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsXiaoyuMod.ModElement.Tag
public class ProcedureZs extends ElementsXiaoyuMod.ModElement {
	public ProcedureZs(ElementsXiaoyuMod instance) {
		super(instance, 33);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Zs!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 2000);
	}
}
