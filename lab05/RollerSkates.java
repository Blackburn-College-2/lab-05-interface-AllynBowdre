/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author allyn
 */
public class RollerSkates implements CanTravel{
    double speed = 8.0;
    int hours = 0;
    int minutes = 0;
    
    
    @Override
    public double move(double miles) {
        hours= (int)(miles/speed);
        miles=miles-(hours*speed);
        minutes=(int)((double)(miles/speed)*60);
        System.out.println("It takes: " + hours + " hours and " + minutes + " minutes ");
        return hours;
    }
    
    @Override
    public String toString(){
        return "Person Roller Skating";
    }
}
