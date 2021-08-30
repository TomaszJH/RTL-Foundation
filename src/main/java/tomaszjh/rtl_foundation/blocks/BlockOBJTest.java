package tomaszjh.rtl_foundation.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOBJTest extends Block {

    public BlockOBJTest() {
        super(Properties.create(Material.BARRIER).hardnessAndResistance(2f).sound(SoundType.METAL));
    }
}
