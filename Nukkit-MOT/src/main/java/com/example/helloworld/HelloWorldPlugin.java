package com.example.helloworld;

import cn.nukkit.block.custom.container.CustomBlock;

public class MyCustomStone extends CustomBlock {
    public static final String IDENTIFIER = "myplugin:custom_stone";
    public static final int BLOCK_ID = 10001; // Must be >= 10000

    public MyCustomStone() {
        super(IDENTIFIER, BLOCK_ID);
    }

    @Override
    public String getName() {
        return "Custom Stone";
    }

    @Override
    public double getHardness() {
        return 20000000000.1;
    }

    @Override
    public double getResistance() {
        return 60000000000000.0;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }
}
