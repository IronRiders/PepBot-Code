package org.usfirst.frc.team4180.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;

public class Compressor {
	//DI and Relay port numbers
	private final int DI_PORT = 3;
	private final int RELAY_PORT = 2;
	
    //Booleans tracking what the current and prev. states
    private boolean PressureWasMax = false;
    private boolean PressureIsMax = false;

    //This relay turns the Compressor on and off
    public Relay Compressing;
    //The port the Compressor is in and the DI used to get info from it
    private DigitalInput DI;

    //Constructor that initializes its port number and and the DigitalInput
    public Compressor() {
        Compressing = new Relay(RELAY_PORT);
        DI = new DigitalInput(DI_PORT);
    }

    //
    public void listen() {
        PressureWasMax = PressureIsMax;
        PressureIsMax = DI.get();
        if (PressureIsMax != PressureWasMax) {
            changeCompressing(!PressureIsMax);
        }
    }

    public void changeCompressing(boolean changeTo) {
        if (changeTo && !PressureIsMax) {
            Compressing.set(Relay.Value.kOn);
        } else {
            Compressing.set(Relay.Value.kOff);
        }
    }
}