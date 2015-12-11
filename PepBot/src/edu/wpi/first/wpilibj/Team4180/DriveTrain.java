/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.Team4180;

import edu.wpi.first.wpilibj.Jaguar;

/**
 *
 * @author kwruff
 */
public class DriveTrain {

    //Declaring motors
    private Jaguar leftJag1;
    private Jaguar leftJag2;
    private Jaguar rightJag1;
    private Jaguar rightJag2;

    private double xPos;
    private double yPos;

    public DriveTrain() {
        leftJag1 = new Jaguar(1);
        leftJag2 = new Jaguar(2);
        rightJag1 = new Jaguar(3);
        rightJag2 = new Jaguar(4);
        xPos = 0.0;
        yPos = 0.0;
    }

    public void setLeftJagSpeed(double leftJagSpeed) {
        leftJag1.set(leftJagSpeed);
        leftJag2.set(leftJagSpeed);
    }

    public void setRightJagSpeed(double rightJagSpeed) {
        rightJag1.set(rightJagSpeed);
        rightJag2.set(rightJagSpeed);
    }

    public void setJagspeed(double leftJagSpeed, double rightJagSpeed) {
        setLeftJagSpeed(leftJagSpeed);
        setRightJagSpeed(rightJagSpeed);
    }

    public void updateXPos(double newXPos) {
        xPos = newXPos;
    }

    public void updateYPos(double newYPos) {
        yPos = newYPos;
    }

    public void updateSpeed(){
    setJagspeed(Math.min((Math.max(-1, yPos+xPos)),1),
            Math.min((Math.max(-1, yPos-xPos)),1));
    }
    
    //TODO: method that sets rightJag speeds
    
    //TODO: method that sets leftJag speeds
    
    //TODO: method that updates speed
    
    //Optional set all motor speeds or a stop robot method

}
