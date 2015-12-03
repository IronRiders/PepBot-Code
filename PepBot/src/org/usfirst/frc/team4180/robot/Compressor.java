package org.usfirst.frc.team4180.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;

public class Compressor {
	private boolean WantCompressorOn;
	private boolean PressureWasMax;
	private boolean PressureIsMax;
	private boolean IsOn;
	private Relay Commpressing;
	private int CompressorPort;
	private DigitalInput DI;
	
	/**
	 * 
	 * @param Port number
	 */
	public Compressor(int portNumber) {
		Integer numberPort = Integer.valueOf(portNumber);
		CompressorPort = numberPort;
		System.out.println("Attached Switch Listener to port " + numberPort);
		DI = new DigitalInput(CompressorPort);
	}
	/**
	 * Updates the whether the pressure is at maximum
	 * If we have just changed state, update whether we are compressing
	 */
	public void listen(){
		PressureWasMax = PressureIsMax;
		PressureIsMax = DI.get();
		if(PressureIsMax !=	PressureWasMax){
			IsOn = getState(WantCompressorOn, PressureIsMax);
		}
	}
	/**
	 * Changes the desired state variable to the boolean passed in
	 * Determines whether to allow continued compression
	 * @param Desired State
	 */
	public void setDesiredState(boolean b) {
		WantCompressorOn = b;
		IsOn = getState(WantCompressorOn, PressureIsMax);
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
