package com.tawfeek.behavioral.state;

public class LockedState extends State {
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new ReadyState(phone));
        return "on Home";
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return "onOffOn";
    }
}
