package net.pedroricardo.content;

import java.util.HashMap;

public class TextureToServerHeadMap {
    public static final HashMap<String, HeadedServerHead> MAP = new HashMap<>();

    public static HeadedServerHead addHead(String originalTexture, String name, String noteBlockSound) {
        return MAP.put(originalTexture, new HeadedServerHead(originalTexture, name, noteBlockSound));
    }
}
