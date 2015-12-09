package edu.wpi.first.wpilibj.Team4180;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;

public class Compressor {
        //Collection of Booleans tracking the state/wanted state
	private boolean WantCompressorOn;
	private boolean PressureWasMax;
	private boolean PressureIsMax;
	private boolean CompressorIsOn;
        
        //TODO: Add a comment for the relay
	private Relay Commpressing;
        
        //The port the Compressor is in and the DI used to get info from it
	private int CompressorPort;
	private DigitalInput DI;
	
	
	//Constructor that initializes its port number and and the DigitalInput
	public Compressor(int portNumber) {
		Integer numberPort = Integer.valueOf(portNumber);
		CompressorPort = numberPort.intValue();
		System.out.println("Attached Switch Listener to port " + numberPort);
		DI = new DigitalInput(CompressorPort);
	}
        
	//
	public void listen(){
		PressureWasMax = PressureIsMax;
		PressureIsMax = DI.get();
		if(PressureIsMax !=	PressureWasMax){
			CompressorIsOn = getState(WantCompressorOn, PressureIsMax);
		}
	}
	/**
	 * Changes the desired state variable to the boolean passed in
	 * Determines whether to allow continued compression
	 * @param Desired State
	 */
	public void setDesiredState(boolean b) {
		WantCompressorOn = b;
		CompressorIsOn = getState(WantCompressorOn, PressureIsMax);
	}
	/**
	 * 
	 * @param Desired compressor state
	 * @param is the Air tank at the maximum pressure?
	 * @return
	 */
	private boolean getState(boolean want, boolean max){
		if(!max) return want;
		else return !max;
	}
}