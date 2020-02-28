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
public class Car implements CanTravel{
    double speed = 60;
    int hours = 0;
    int minutes = 0;
    
    
    @Override
    public double move(double miles) {
        int extraHours=0, extraMinutes=0, extraTime=(int) (miles/300)*20;
            extraHours=(int)(extraTime/60);
            hours+=extraHours;
            extraTime=extraTime-(extraHours*60);
            extraMinutes = extraTime;
            minutes += extraMinutes;
            
        
        hours += (int)(miles/speed);
        miles = miles-(hours*speed);
        minutes += (int)((double)(miles/speed)*60);
        System.out.println("It takes: " + hours + " hours and " + minutes + " minutes ");
        return hours;
    }
    
    @Override
    public String toString(){
        return "Car Traveling";
    }
}
