
package org.usfirst.frc.team4180.robot;

import listeners.Attack3Joystick;
import listeners.ButtonControls;
import listeners.MovementListener;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Relay.Value;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	private MovementListener movementListener;
	private ButtonControls buttonControls;
	private Attack3Joystick joystick1;
	private DriveTrain driveTrain;
	private Pneumatics pneumatics;
	private Compressor compressor;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	driveTrain = new DriveTrain();
    	movementListener = new MovementListener(driveTrain);
    	pneumatics = new Pneumatics();
    	buttonControls = new ButtonControls(pneumatics);
    	joystick1 = new Attack3Joystick(0);
    	joystick1.addJoystickListener(movementListener);
    	joystick1.addButtonListener(joystick1.BUTTONS, buttonControls);
    	/*compressor = new Compressor();
    	compressor.Compressing.set(Value.kForward);*/
    }
    
    public void teleopInit(){
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	//compressor.listen();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        joystick1.listen();
        //compressor.listen();
    }
    
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
