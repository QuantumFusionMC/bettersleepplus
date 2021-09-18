package dev.quantumfusion.bettersleepplus.mixin;

import net.minecraft.server.world.SleepManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;


@Mixin(SleepManager.class)
public class SleepOverrideMixin {

	@SuppressWarnings("OverwriteAuthorRequired")
	@Overwrite
	public boolean canSkipNight(int percentage) {
		return false;
	}
}
