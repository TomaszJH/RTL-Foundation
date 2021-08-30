package tomaszjh.rtl_foundation.tiles;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.items.ItemStackHandler;

public abstract class GenericTileEntity extends TileEntity implements ITickableTileEntity {

    public GenericTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    @Override
    public void tick() {

    }
}
