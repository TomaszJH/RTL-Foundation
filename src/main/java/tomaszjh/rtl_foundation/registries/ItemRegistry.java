package tomaszjh.rtl_foundation.registries;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import tomaszjh.rtl_foundation.RTL_Foundation;
import tomaszjh.rtl_foundation.blocks.BlockOBJTest;
import tomaszjh.rtl_foundation.manuals.ManualItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tomaszjh.rtl_foundation.items.ResourceItem;
import tomaszjh.rtl_foundation.items.SampleManual;
import tomaszjh.rtl_foundation.items.UniversalWrench;

public class ItemRegistry {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RTL_Foundation.MOD_ID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RTL_Foundation.MOD_ID);

    public static final RegistryObject<Item> UNIVERSAL_WRENCH = ITEMS.register("universal_wrench", UniversalWrench::new);

    public static final RegistryObject<ResourceItem> COPPER_INGOT = ITEMS.register("copper_ingot", ResourceItem::new);
    public static final RegistryObject<ResourceItem> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",ResourceItem::new);
    public static final RegistryObject<ResourceItem> TIN_INGOT = ITEMS.register("tin_ingot",ResourceItem::new);
    public static final RegistryObject<ResourceItem> SILVER_INGOT = ITEMS.register("silver_ingot",ResourceItem::new);
    public static final RegistryObject<ResourceItem> NICKEL_INGOT = ITEMS.register("nickel_ingot",ResourceItem::new);
    public static final RegistryObject<ResourceItem> LEAD_INGOT = ITEMS.register("lead_ingot",ResourceItem::new);
    public static final RegistryObject<ResourceItem> BORON_INGOT = ITEMS.register("boron_ingot",ResourceItem::new);
    public static final RegistryObject<ResourceItem> STEEL_INGOT = ITEMS.register("steel_ingot",ResourceItem::new);

    public static final RegistryObject<ResourceItem> COPPER_NUGGET = ITEMS.register("copper_nugget",ResourceItem::new);
    public static final RegistryObject<ResourceItem> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",ResourceItem::new);
    public static final RegistryObject<ResourceItem> TIN_NUGGET = ITEMS.register("tin_nugget",ResourceItem::new);
    public static final RegistryObject<ResourceItem> SILVER_NUGGET = ITEMS.register("silver_nugget",ResourceItem::new);
    public static final RegistryObject<ResourceItem> NICKEL_NUGGET = ITEMS.register("nickel_nugget",ResourceItem::new);
    public static final RegistryObject<ResourceItem> LEAD_NUGGET = ITEMS.register("lead_nugget",ResourceItem::new);
    public static final RegistryObject<ResourceItem> BORON_NUGGET = ITEMS.register("boron_nugget",ResourceItem::new);
    public static final RegistryObject<ResourceItem> STEEL_NUGGET = ITEMS.register("steel_nugget",ResourceItem::new);

    public static final RegistryObject<ManualItemBase> SAMPLE_MANUAL = ITEMS.register("sample_manual", SampleManual::new);

    public static final RegistryObject<Block> OBJ_TEST= BLOCKS.register("obj_test", BlockOBJTest::new);
    public static final RegistryObject<Item> OBJ_TEST_ITEM = ITEMS.register("obj_test", () -> new BlockItem(OBJ_TEST.get(), new Item.Properties().group(RTL_Foundation.TAB)));



    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
