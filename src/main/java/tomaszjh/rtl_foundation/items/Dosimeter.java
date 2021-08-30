package tomaszjh.rtl_foundation.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import tomaszjh.rtl_foundation.RTL_Foundation;

public class Dosimeter extends Item {

    public Dosimeter() {
        super(new Properties().group(RTL_Foundation.TAB).maxStackSize(1));
    }


    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getHeldItem(hand);
        //TODO: player.getCapability(CapabilityRadiation.RADIATION_CAPABILITY).ifPresent(); or smth
        return new ActionResult<>(ActionResultType.PASS, itemStack);
    }

}
