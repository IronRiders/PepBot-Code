
package edu.wpi.first.wpilibj.Team4180;

public class MovementListener implements JoystickListener {
	private DriveTrain driveTrain;
	
	public MovementListener(DriveTrain newDriveTrain){
		driveTrain = newDriveTrain;
	}
	
	//@Override
	public void joystickMoved(double x, double y, double z) {
		//tolerance zone
		if(y > -.05 && y < .05){
			y = 0;
		}
		if(x > -.05 && x < .05){
			x = 0;
		}
        driveTrain.updateXPos(x);
        driveTrain.updateYPos(y);
        driveTrain.updateSpeed();
	}

}

