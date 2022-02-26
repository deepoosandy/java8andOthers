package com.java8.practice.map;

import java.util.Optional;
import java.util.function.Predicate;

public class TestFlatMap {
    public static void main(String[] args) {
        Computer testMapClass1=new Computer();

    }
}
 class Computer {
    private Optional<Soundcard> soundcard;
    public Optional<Soundcard> getSoundcard() {
        return this.soundcard;
    }

}
 class Soundcard {
    private Optional<USB> usb;
    public Optional<USB> getUSB() { return this.usb;}

}

 class USB{
    public String getVersion(){ return ""; }
}

