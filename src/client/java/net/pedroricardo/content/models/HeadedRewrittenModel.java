package net.pedroricardo.content.models;

import org.joml.Vector3f;

public interface HeadedRewrittenModel {
    default Vector3f getHeadSizeInPixels() {
        return new Vector3f(8.0f, 8.0f, 8.0f);
    }
}
