package com.ibq2d.engine.core;

import com.ibq2d.engine.core.Application;
import com.ibq2d.engine.core.IGameListener;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public final class Window {
    private Window() {}

    public static void createWindow(int width, int height, String title) {
        Display.setTitle(title);

        try {
            Display.setDisplayMode(new DisplayMode(width, height));
            Display.create();
            Display.setVSyncEnabled(true);
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
    }

    public static void render() {
        for (IGameListener gml : Application.gameListeners)
            gml.draw();

        Display.update();
    }

    public static void dispose() {
        Display.destroy();
    }

    public static boolean isCloseRequested() {
        return Display.isCloseRequested();
    }
}