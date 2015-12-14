
package org.usfirst.frc.team4180.robot;

import listeners.Attack3Joystick;
import listeners.MovementListener;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	private MovementListener movementListener;
	private Attack3Joystick joystick1;
	private DriveTrain driveTrain;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	movementListener = new MovementListener(driveTrain);
    	joystick1 = new Attack3Joystick(1);
    	driveTrain = new DriveTrain();
    	joystick1.addJoystickListener(movementListener);

    }
    
    public void teleopInit(){
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        joystick1.listen();
    }
    
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
