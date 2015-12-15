package listeners;

import org.usfirst.frc.team4180.robot.Pneumatics;

import listeners.Attack3Joystick.Button;

public class ButtonControls implements ButtonListener {
	
	Pneumatics pneumatics;
	
	public ButtonControls(Pneumatics pneumatics) {
		this.pneumatics = pneumatics;
	}
	
	@Override
	public void buttonUp(Button button) {
        if(button == Attack3Joystick.Button.BUTTON_1) {
        	pneumatics.setShoot(false);
        }
        else if(button == Attack3Joystick.Button.BUTTON_2) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_3) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_4) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_5) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_6) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_7) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_8) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_9) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_10) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_11) {
            
        }
    }

	@Override
    public void buttonDown(Button button) {
        if(button == Attack3Joystick.Button.BUTTON_1) {
        	pneumatics.setShoot(true);
        }
        else if(button == Attack3Joystick.Button.BUTTON_2) {
            pneumatics.toggleElevation();
        }
        else if(button == Attack3Joystick.Button.BUTTON_3) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_4) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_5) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_6) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_7) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_8) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_9) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_10) {
            
        }
        else if(button == Attack3Joystick.Button.BUTTON_11) {
            
        }
	}
}
