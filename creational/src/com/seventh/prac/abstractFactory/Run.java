package com.seventh.prac.abstractFactory;

public class Run {

    public static void main(String[] args) {
        Computer mac = ComputerFactory.getComputer(new MacFactory("애플키보드", "애플모니터", "애플마우스"));
        Computer samsung = ComputerFactory.getComputer(new SamsungFactory("삼성키보드", "삼성모니터", "삼성마우스"));

        System.out.println("mac = " + mac);
        System.out.println("samsung = " + samsung);
    }

}
