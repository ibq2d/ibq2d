package com.ibq2d.engine.core;

public interface Batch {
    void draw(Texture texture, float x, float y);
    void draw(Texture texture, float x, float y, float scaleX, float scaleY, float rotation);
}