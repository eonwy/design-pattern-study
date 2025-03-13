package com.seventh.prac.abstractFactory;

public abstract class Computer {

    public abstract String getKeyBoard();
    public abstract String getMonitor();
    public abstract String getMouse();

    @Override
    public String toString() {
        return "KeyBoard: " + getKeyBoard() + ", Monitor: " + getMonitor() + ", Mouse: " + getMouse();
    }
}
