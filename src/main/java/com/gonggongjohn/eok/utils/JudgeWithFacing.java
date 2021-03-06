package com.gonggongjohn.eok.utils;

import javax.annotation.Nullable;

import net.minecraft.util.EnumFacing;

public class JudgeWithFacing {
    protected boolean judge;
    protected EnumFacing facing;

    public JudgeWithFacing(boolean judge, @Nullable EnumFacing facing) {
        this.judge = judge;
        this.facing = facing;
    }

    public boolean isComplete() {
        return this.judge;
    }

    public EnumFacing getFacing() {
        return this.facing;
    }
}
