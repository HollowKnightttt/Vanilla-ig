package hollowkightttt.vanilla-ig;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.block.custom.CustomBlockManager;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;

void registerBlock(int blockId, Class<? extends Block> blockClass) {
        Block.list[blockId] = blockClass;
        Block block;
        try {
            block = blockClass.newInstance();
            try {
                Constructor<?> constructor = blockClass.getDeclaredConstructor(int.class);
                constructor.setAccessible(true);
                for (int data = 0; data < (1 << Block.DATA_BITS); ++data) {
                    int fullId = (blockId << Block.DATA_BITS) | data;
                    Block.fullList[fullId] = (Block) constructor.newInstance(data);
                }
                Block.hasMeta[blockId] = true;
            } catch (NoSuchMethodException ignore) {
                for (int data = 0; data < Block.DATA_SIZE; ++data) {
                    int fullId = (blockId << Block.DATA_BITS) | data;
                    Block.fullList[fullId] = block;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Block.solid[blockId] = block.isSolid();
        Block.transparent[blockId] = block.isTransparent();
        Block.hardness[blockId] = block.getHardness();
        Block.light[blockId] = block.getLightLevel();
        if (block.isSolid()) {
            if (block.isTransparent()) {
                if (block instanceof BlockLiquid || block instanceof BlockIce) {
                    Block.lightFilter[blockId] = 2;
                } else {
                    Block.lightFilter[blockId] = 1;
                }
            } else {
                Block.lightFilter[blockId] = 15;
            }
        } else {
            Block.lightFilter[blockId] = 1;
        }
}

registerBlock(1423, WOODEN_SLAB) 
registerBlock() 
