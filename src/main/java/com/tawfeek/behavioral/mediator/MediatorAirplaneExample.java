package com.tawfeek.behavioral.mediator;


interface AirPlane{
    void requestTakeoff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}

class CommercialAirplane implements AirPlane{
    private AirTrafficControlTower mediator;

    public CommercialAirplane(AirTrafficControlTower mediator) {
        this.mediator = mediator;
    }
    @Override
    public void requestTakeoff() {
        mediator.requestTakeoff(this);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.println("CommercialAirplane notifyAirTrafficControl: " + message);
    }
}


interface AirTrafficControlTower{
    void requestTakeoff(AirPlane airPlane);
    void requestLanding(AirPlane airPlane);
}

class AirTrafficControlTowerImpl implements AirTrafficControlTower{


    @Override
    public void requestTakeoff(AirPlane airPlane) {
        airPlane.notifyAirTrafficControl("Takeoff");
    }

    @Override
    public void requestLanding(AirPlane airPlane) {
        airPlane.notifyAirTrafficControl("Landing");
    }
}


public class MediatorAirplaneExample {
}
