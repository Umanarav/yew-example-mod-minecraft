package gay.iamyew.marijuana.item.custom;

import net.minecraft.sound.SoundEvent;
import net.minecraft.item.MusicDiscItem;

public class ModMusicDiscItem extends MusicDiscItem {
    public ModMusicDiscItem(int comparatorOutput, SoundEvent sound, Settings settings) {
        super(comparatorOutput, sound, settings, comparatorOutput);
    }
}