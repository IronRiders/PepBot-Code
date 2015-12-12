package edu.wpi.first.wpilibj.Team4180;

import edu.wpi.first.wpilibj.Solenoid;

public class Pneumatics {
    private Solenoid solenoid;
    private int port;

    public Pneumatics(int solenoidPort) {
        solenoid = new Solenoid(solenoidPort);
        port = solenoidPort;
    }

    public void changeState(boolean changeTo) {
        solenoid.set(changeTo);
    }
}
