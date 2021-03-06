package com.ibq2d.engine;

import com.ibq2d.engine.core.Scene;
import testgame.*;
import org.lwjgl.input.Keyboard;

public final class Application {

    private Application() {}

    public static final String APP_NAME = "ibq2d: Pong";

    public static final String PATH_TO_TEXTURES = "./res/textures/";
    public static final String PATH_TO_AUDIOS = "./res/audio/";
    public static final String PATH_TO_FONTS = "./res/fonts/";

    public static final int WIDTH = 480;
    public static final int HEIGHT = 600;

    public static final int targetFrameRate = 60;

    public static final int[] horizontalAxis = { Keyboard.KEY_A, Keyboard.KEY_D };
    public static final int[] verticalAxis = { Keyboard.KEY_S, Keyboard.KEY_W };

    public static final Scene scenes[] = new Scene[] { new StartScreen(), new MainScene(), new PauseScreen()};

    public static final int HALF_WIDTH = WIDTH/2;
    public static final int HALF_HEIGHT = HEIGHT/2;
}