package com.toc8730.mtb.common;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.level.Level;

public class Butterfly extends FlyingMob{
    public Butterfly(EntityType<? extends Butterfly> entityType, Level level) {
        super(entityType, level);
    }
}
