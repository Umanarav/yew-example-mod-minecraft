package gay.iamyew.marijuana.painting;

import gay.iamyew.marijuana.MarijuanaMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPainting {
    public static final PaintingVariant PARADISE_TREE_ALBUM_COVER_OPEN = registerPainting("paradise_tree_album_cover_open", new PaintingVariant(16, 16));

    public static final PaintingVariant PURPLE_VILLAIN_SQUARE = registerPainting("purple_villain_square", new PaintingVariant(16, 16));
    public static final PaintingVariant RED_VILLAIN_SQUARE = registerPainting("red_villain_square", new PaintingVariant(16, 16));
    public static final PaintingVariant ASRA_SELF_PORTRAIT_VERTICAL = registerPainting("asra_self_portrait_vertical", new PaintingVariant(16, 32));
    public static final PaintingVariant RED_VILLAIN_HEART_VERTICAL = registerPainting("red_villain_heart_vertical", new PaintingVariant(16, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, 
            new Identifier(MarijuanaMod.MOD_ID, name),
                paintingVariant);
    }

    public static void registerPaintings() {
        MarijuanaMod.LOGGER.debug("Registering paintings for ",(MarijuanaMod.MOD_ID));
    }
}
