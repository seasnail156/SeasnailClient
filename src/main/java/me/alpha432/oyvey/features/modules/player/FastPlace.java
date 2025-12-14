package me.alpha432.oyvey.features.modules.player;

import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.world.item.Items;

public class FastPlace extends Module {
    public FastPlace() {
        super("FastPlace", "I wonder what this does...", Category.PLAYER);
    }

    @Override
    public void onTick() {
        if (nullCheck()) return;

        if (mc.player.isHolding(Items.EXPERIENCE_BOTTLE)) {
            mc.rightClickDelay = 0;
        }
    }
}
