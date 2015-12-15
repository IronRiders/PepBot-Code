package org.usfirst.frc.team4180.robot;

import edu.wpi.first.wpilibj.Solenoid;

public class Pneumatics {
	public static final int TEMP_PORT = 10;
	public static final int SHOOT_PORT = 1;
	public static final int ELEVATION_PORT = 0;
    private Solenoid shootSolenoid;
    private Solenoid elevationSolenoid;

    public Pneumatics() {
        shootSolenoid = new Solenoid(SHOOT_PORT);
        elevationSolenoid = new Solenoid(1, ELEVATION_PORT);
    }

    public void setShoot(boolean setTo) {
        shootSolenoid.set(setTo);
    }
 
    public void setElevation(boolean setTo) {
    	elevationSolenoid.set(setTo);
    }
    
    public void toggleElevation(){
    	elevationSolenoid.set(!elevationSolenoid.get());
    }
    
}