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
public class Lab05 {
    static double miles;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //estimated time 3 hours
        miles=10.0;
        Walking w = new Walking();
        RoundTrip(w);
        Plane p = new Plane();
        RoundTrip(p);
        miles=1000.0;
        RoundTrip(w);
        RoundTrip(p);
        
        
        
        
        
    }
    
    public static void RoundTrip(CanTravel a){
        int tot=0;
        System.out.println("Round Trip!\nLeaving...\n" + a.toString() + ": " + miles);
        tot+=a.move(miles);
        System.out.println("Returning...\n" + a.toString() + ": " + miles);
        tot+=a.move(miles);
        System.out.println("Total Travel Time: "+ (tot) + "ish hours");
        System.out.println("---------------------------------------------");
          
    }
    
}
