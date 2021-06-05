package net.probie.xiaoyu.procedure;

import net.probie.xiaoyu.ElementsXiaoyuMod;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import java.util.Map;

@ElementsXiaoyuMod.ModElement.Tag
public class ProcedureAjbdAnXiaAnJianShi extends ElementsXiaoyuMod.ModElement {
	public ProcedureAjbdAnXiaAnJianShi(ElementsXiaoyuMod instance) {
		super(instance, 40);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AjbdAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AjbdAnXiaAnJianShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		double fireHeight = 0;
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getMinecraftServer() != null) {
				_ent.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return _ent.world;
					}

					@Override
					public MinecraftServer getServer() {
						return _ent.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return _ent.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(_ent.posX, _ent.posY, _ent.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return _ent;
					}
				}, "kill @e[type=!player]");
			}
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u00A7c\u00A7l\u6240\u6709\u5B9E\u4F53\u5DF2\u88AB\u6E05\u9664"));
		}
	}
}
