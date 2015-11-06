package com.ibq2d.engine;

import org.lwjgl.input.Keyboard;

public final class Application {
    private Application() {}

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public static final float originX = WIDTH/2;
    public static final float originY = HEIGHT/2;

    public static final String APP_NAME = "ibq2d";

    public static final int targetFrameRate = 60;

    public static final int[] horizontalAxis = { Keyboard.KEY_A, Keyboard.KEY_D };
    public static final int[] verticalAxis = { Keyboard.KEY_S, Keyboard.KEY_W };
}