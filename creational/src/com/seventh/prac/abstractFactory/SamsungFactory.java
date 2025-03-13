package com.seventh.prac.abstractFactory;

public class SamsungFactory implements ComputerAbstractFactory{

    private String keyboard;
    private String monitor;
    private String mouse;

    public SamsungFactory(String keyboard, String monitor, String mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    @Override
    public Computer createComputer() {
        return new Samsung(keyboard, monitor, mouse);
    }
}
