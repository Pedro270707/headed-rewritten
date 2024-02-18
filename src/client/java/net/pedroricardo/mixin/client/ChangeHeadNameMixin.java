package net.pedroricardo.mixin.client;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SkullItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.text.Text;
import net.pedroricardo.content.TextureToHeadMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(SkullItem.class)
public class ChangeHeadNameMixin {
    @ModifyReturnValue(method = "getName", at = @At(value = "RETURN", ordinal = 0))
    private Text headedrewritten$getCorrectName(Text original, @Local(ordinal = 0) ItemStack stack, @Local(ordinal = 0) String string) {
        NbtCompound nbt = stack.getNbt();
        if (nbt == null || !nbt.contains("SkullOwner", NbtElement.COMPOUND_TYPE)) return original;
        GameProfile gameProfile = NbtHelper.toGameProfile(nbt.getCompound("SkullOwner"));
        if (gameProfile != null && gameProfile.getProperties().containsKey("textures") && MinecraftClient.getInstance().getSkinProvider().getTextures(gameProfile).containsKey(MinecraftProfileTexture.Type.SKIN) && TextureToHeadMap.contains(MinecraftClient.getInstance().getSkinProvider().getTextures(gameProfile).get(MinecraftProfileTexture.Type.SKIN).getUrl())) {
            return Text.translatable(((SkullItem)(Object)this).getTranslationKey() + ".named_headed_rewritten", string);
        }
        return original;
    }
}
