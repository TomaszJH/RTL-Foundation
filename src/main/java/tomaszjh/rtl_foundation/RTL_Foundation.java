package tomaszjh.rtl_foundation;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tomaszjh.rtl_foundation.eastereggs.Octobertwentyeighth;
import tomaszjh.rtl_foundation.proxy.ClientProxy;
import tomaszjh.rtl_foundation.proxy.CommonProxy;
import tomaszjh.rtl_foundation.registries.ItemRegistry;

import java.text.SimpleDateFormat;
import java.util.Date;

import static tomaszjh.rtl_foundation.registries.ItemRegistry.UNIVERSAL_WRENCH;

@Mod(RTL_Foundation.MOD_ID)
@Mod.EventBusSubscriber(modid = RTL_Foundation.MOD_ID)
public class RTL_Foundation {

    public static CommonProxy PROXY = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rtl_foundation";
    public static final String VERSION = "$version";
    public static final ResourceLocation RTL_BACKGROUND = new ResourceLocation("rtl_foundation:textures/gui/container/tab_rtl_items.png");



    public static ItemGroup TAB = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(UNIVERSAL_WRENCH.get());
        }

    }.setBackgroundImage(RTL_BACKGROUND);

    public static ItemGroup MAN_TAB = new ItemGroup("rtl_manuals") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(UNIVERSAL_WRENCH.get());
        }
    }.setBackgroundImage(RTL_BACKGROUND);


    public RTL_Foundation() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupComplete);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(PROXY);

        ItemRegistry.init();


    }

    private void setup(final FMLCommonSetupEvent event) {
    }


    private void setupComplete(final FMLLoadCompleteEvent event) {


        SimpleDateFormat dateFormat = new SimpleDateFormat();
        Date date = new Date();
        if (dateFormat.format(date).equals("28/10")) {
            Octobertwentyeighth.easterEgg();
            //Random Easter Egg (if it works)
        } else {
            LOGGER.info("RTL Mods Initalized, Let's Rock!");
        }

    }
}
