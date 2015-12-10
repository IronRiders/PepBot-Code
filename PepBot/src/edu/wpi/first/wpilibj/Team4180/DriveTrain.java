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
    Jaguar leftJag1;
    Jaguar leftJag2;
    Jaguar rightJag1;
    Jaguar rightJag2;
    
    double xPos;
    double yPos;
    //double speed;
    
    public DriveTrain(){
        leftJag1 = new Jaguar(1);
        leftJag2 = new Jaguar(2);
        rightJag1 = new Jaguar(3);
        rightJag2 = new Jaguar(4);
        //double xPos;
        //double yPos;
    }
    
    //TODO: method that sets rightJag speeds
    
    //TODO: method that sets leftJag speeds
    
    //TODO: method that updates speed
    
    //Optional set all motor speeds or a stop robot method

}
