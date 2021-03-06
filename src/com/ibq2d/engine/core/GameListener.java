package com.ibq2d.engine.core;

public abstract class GameListener implements IGameListener {

    private boolean enabled = true;
    private String name;

    boolean persistentActed = false;
    boolean startCalled = false;

    public GameListener() {
        name = getClass().getSimpleName();
    }

    public final String getName() {
        return name;
    }

    @Override
    public void awake() {
    }

    @Override
    public void start() {
    }

    @Override
    public void update() {
    }

    @Override
    public void draw() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public final boolean isEnabled() {
        return enabled;
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    @Override
    public void onQuit() {
        
    }

    public final void setEnabled(boolean enabled) {
        this.enabled = enabled;
        if (enabled) {
            onEnable();
            if (!startCalled)
                start();
        }
        else onDisable();
    }
}