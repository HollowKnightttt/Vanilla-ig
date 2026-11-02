import cn.nukkit.block.custom.CustomBlockManager;
import cn.nukkit.block.custom.CustomBlockDefinition;
import cn.nukkit.math.Vector3f;
import cn.nukkitmot.exampleplugin.custom.block.MyCustomStone;

public class ExamplePlugin extends PluginBase {
    @Override
    public void onEnable() {
        CustomBlockManager.get().registerCustomBlock(
            MyCustomStone.IDENTIFIER,
            MyCustomStone.BLOCK_ID,
            CustomBlockDefinition.builder(new MyCustomStone())
                .name("Custom Stone")
                .texture("custom_stone")
                .breakTime(1.5)
                .collisionBox(new Vector3f(-8, 0, -8), new Vector3f(16, 16, 16))
                .selectionBox(new Vector3f(-8, 0, -8), new Vector3f(16, 16, 16))
                .creativeGroup("itemGroup.name.stoneBrick")
                .creativeCategory(CreativeItemCategory.CONSTRUCTION)
                .build(),
            MyCustomStone::new
        );
    }
}
