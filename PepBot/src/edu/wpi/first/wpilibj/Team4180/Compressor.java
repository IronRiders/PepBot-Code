package edu.wpi.first.wpilibj.Team4180;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;

public class Compressor {

    //Collection of Booleans tracking the state/wanted state
    private boolean WantCompressorOn;
    private boolean PressureWasMax;
    private boolean PressureIsMax;
    //private boolean CompressorIsOn;

    //This relay turns the Compressor on the 
    private Relay Compressing;
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
        if (PressureIsMax != PressureWasMax) 
            changeCompressing();
    }

    /**
     * Changes the desired state variable to the boolean passed in Determines
     * whether to allow continued compression
     *
     * @param Desired State
     */
    public void setDesiredState(boolean b) {
        WantCompressorOn = b;
        changeCompressing();
    }

    /**
     *
     * @param want Desired compressor state
     * @param max is the Air tank at the maximum pressure?
     * @return
     */
    private boolean getState(boolean want, boolean max) {
        if (!max) {
            return want;
        } else {
            return !max;
        }
    }
    private void changeCompressing(){
       boolean b = getState(WantCompressorOn, PressureIsMax);
        if(b) Compressing.set(Relay.Value.kOn); 
        else  Compressing.set(Relay.Value.kOff); 
    }
}
