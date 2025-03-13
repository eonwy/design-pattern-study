package com.seventh.prac.abstractFactory;

public class MacFactory implements ComputerAbstractFactory{

    private String keyboard;
    private String monitor;
    private String mouse;

    public MacFactory(String keyboard, String monitor, String mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    @Override
    public Computer createComputer() {
        return new Mac(keyboard, monitor, mouse);
    }
}
