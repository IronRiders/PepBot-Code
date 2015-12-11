
package edu.wpi.first.wpilibj.Team4180;

import edu.wpi.first.wpilibj.Jaguar;

public class DriveTrain {

    //Declaring motors
    private Jaguar leftJag1;
    private Jaguar leftJag2;
    private Jaguar rightJag1;
    private Jaguar rightJag2;

    //Declaring variables
    private double xPos;
    private double yPos;

    public DriveTrain() {
        //Initialize motors and variables
        leftJag1 = new Jaguar(1);
        leftJag2 = new Jaguar(2);
        rightJag1 = new Jaguar(3);
        rightJag2 = new Jaguar(4);
        xPos = 0.0;
        yPos = 0.0;
    }

    //method that sets leftJag speeds
    public void setLeftJagSpeed(double leftJagSpeed) {
        leftJag1.set(leftJagSpeed);
        leftJag2.set(leftJagSpeed);
    }

    //method that sets rightJag speeds
    public void setRightJagSpeed(double rightJagSpeed) {
        rightJag1.set(rightJagSpeed);
        rightJag2.set(rightJagSpeed);
    }

    //method that sets speed of both sides
    public void setJagspeed(double leftJagSpeed, double rightJagSpeed) {
        setLeftJagSpeed(leftJagSpeed);
        setRightJagSpeed(rightJagSpeed);
    }

    //xPos setter
    public void updateXPos(double newXPos) {
        xPos = newXPos;
    }

    //yPos setter
    public void updateYPos(double newYPos) {
        yPos = newYPos;
    }

    //method that updates speed
    public void updateSpeed(){
        setJagspeed(Math.min((Math.max(-1, yPos-xPos)),1),
            Math.min((Math.max(-1, yPos+xPos)),1));
    }
    
    //Optionally make methods that set all motor speeds or a stop robot method

}
