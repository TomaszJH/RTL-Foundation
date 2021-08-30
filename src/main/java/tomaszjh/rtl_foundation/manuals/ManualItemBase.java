package tomaszjh.rtl_foundation.manuals;

import tomaszjh.rtl_foundation.RTL_Foundation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public abstract class ManualItemBase extends Item {
    public ManualItemBase() {
        super(new Properties().maxStackSize(1).group(RTL_Foundation.MAN_TAB));
    }

    public String window;
    public ItemStack itemstack;
    protected String manualPath;

    public void initManual(String gui) {
        gui = manualPath;
    }


    public void setManual(String windowID) {
        this.window = windowID;
    }

    @Override
    public ActionResult onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
        if(worldIn.isRemote) {
            ManualGuiBase.openManual(window, itemstack);
        }
        return new ActionResult<>(ActionResultType.PASS, itemStack);
    }



}
