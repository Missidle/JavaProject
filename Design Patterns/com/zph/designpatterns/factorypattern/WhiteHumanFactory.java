package com.zph.designpatterns.factorypattern;

public class WhiteHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
