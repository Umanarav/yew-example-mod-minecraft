package gay.iamyew.marijuana.sound;

import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModSounds {
    public static final Identifier JOINT_SMOKE_ID = new Identifier("marijuanamod:joint_smoke");
    public static final SoundEvent JOINT_SMOKE = SoundEvent.of(JOINT_SMOKE_ID);
    public static final Identifier BONG_SMOKE_ID = new Identifier("marijuanamod:bong_smoke");
    public static final SoundEvent BONG_SMOKE = SoundEvent.of(BONG_SMOKE_ID);
    
    public static final Identifier WEED_MUSIC_DISC_ID = new Identifier("marijuanamod:weed_music_disc");
    public static final SoundEvent WEED_MUSIC_DISC = SoundEvent.of(WEED_MUSIC_DISC_ID);

    public static final Identifier ANARCHY_REIGNS_MUSIC_DISC_ID = new Identifier("marijuanamod:anarchy_reigns_music_disc");
    public static final SoundEvent ANARCHY_REIGNS_MUSIC_DISC = SoundEvent.of(ANARCHY_REIGNS_MUSIC_DISC_ID);

    public static void registerModSounds() {
        Registry.register(Registries.SOUND_EVENT, JOINT_SMOKE_ID, JOINT_SMOKE);
        Registry.register(Registries.SOUND_EVENT, BONG_SMOKE_ID, BONG_SMOKE);
        Registry.register(Registries.SOUND_EVENT, WEED_MUSIC_DISC_ID, WEED_MUSIC_DISC);
        Registry.register(Registries.SOUND_EVENT, ANARCHY_REIGNS_MUSIC_DISC_ID, ANARCHY_REIGNS_MUSIC_DISC);

    }  

}
