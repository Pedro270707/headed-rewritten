package net.pedroricardo.content;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "headed-rewritten")
@Config(name = "headed-rewritten", wrapperName = "HeadedRewrittenConfig")
public class HeadedRewrittenConfigModel {
    public boolean chargedCreeperDrops = false;

    public boolean changeHeadCollisions = true;
}
