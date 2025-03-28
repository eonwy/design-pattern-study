package com.seventh.prac.abstractFactory;

public class Mac extends Computer{

    private String keyboard;
    private String monitor;
    private String mouse;

    public Mac(String keyboard, String monitor, String mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    @Override
    public String getKeyBoard() {
        return this.keyboard;
    }

    @Override
    public String getMonitor() {
        return this.monitor;
    }

    @Override
    public String getMouse() {
        return this.mouse;
    }
}
