package edu.wpi.first.wpilibj.Team4180;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;

public class Compressor {

    //Booleans tracking what the current and prev. states
    private boolean PressureWasMax = false;
    private boolean PressureIsMax = false;

    //This relay turns the Compressor on and off
    public Relay Compressing;
    //The port the Compressor is in and the DI used to get info from it
    private DigitalInput DI;

    //Constructor that initializes its port number and and the DigitalInput
    public Compressor(int compPortNumber, int inputPort) {
        Compressing = new Relay(compPortNumber);
        DI = new DigitalInput(inputPort);
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
