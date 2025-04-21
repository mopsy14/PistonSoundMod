package mopsy.productions.piston_sound_mod.mixins;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {
    @Inject(method = "onPlaySound",at = @At("HEAD"), cancellable = true)
    private void onSoundReceived(PlaySoundS2CPacket packet, CallbackInfo ci){
        if(packet.getSound().value() == SoundEvents.BLOCK_PISTON_EXTEND||
                packet.getSound().value() == SoundEvents.BLOCK_PISTON_CONTRACT)
            ci.cancel();
    }
}
