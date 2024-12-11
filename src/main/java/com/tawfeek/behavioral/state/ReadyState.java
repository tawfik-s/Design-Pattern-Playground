package com.tawfeek.behavioral.state;

public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {

        return "home button pressed";
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return "off button pressed";
    }
}
