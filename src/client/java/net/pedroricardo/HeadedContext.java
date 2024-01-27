package net.pedroricardo;

import com.mojang.authlib.GameProfile;

public class HeadedContext {
    public static GameProfile currentProfile = null;

    public static boolean isInHeadedServer = false;
}
