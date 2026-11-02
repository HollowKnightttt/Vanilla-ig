package petterim1.customblockexample;

import cn.nukkit.block.custom.CustomBlockManager;
import cn.nukkit.block.custom.container.CustomBlock;

// You can also extend other existing item behavior like ItemArmor, ItemEdible or ItemTool
// Just remember to implement CustomItem
public class MyCustomBlock extends CustomBlock {

    public static final String IDENTIFIER = "minecraft:unknown_reversed19";

    // NOTE: Nukkit currently still saves blocks by their legacy ID so make sure there are no conflicting IDs between plugins!
    public static final int NUKKIT_ID = CustomBlockManager.LOWEST_CUSTOM_BLOCK_ID;

    public MyCustomBlock() {
        super("tester:minecraft_4-mega-12-12-12_reversed1", NUKKIT_ID);
    }
}
