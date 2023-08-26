/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.rocket;

/**
 *
 * @author novil
 */
public class Rocket {
    
    public static final int STATUS_NON_ACTIVE = 0;
    public static final int STATUS_TAKE_OFF = 1;
    public static final int STATUS_FLYING = 2;
    public static final int STATUS_FLOATING = 3;
    
    public int status = Rocket.STATUS_NON_ACTIVE;
    
    // jumlah tempat duduk
    public final int numberOfSeats = 4;
    
    public final int fuelCapacityInLiter = 300;
    
    public final int kmSpeedPerHour = 28000;
    
    private int healthPoint = 100;
    
    public Rocket() {
        // System.out.println("Rocket was constructed and ready to go.");
    }
    
    public final int getHealthPoint() {
        return healthPoint;
    }
    
    public final void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
        
        if (this.healthPoint < 0) {
            this.healthPoint = 0;
        }
    }
    
    public final void updateRocketStatus() {
        if (this.kmSpeedPerHour == 0) {
            this.status = Rocket.STATUS_NON_ACTIVE;
        } else if (this.kmSpeedPerHour > 0.005 && this.kmSpeedPerHour <= 0.5) {
            this.status = Rocket.STATUS_TAKE_OFF;
        } else if (this.kmSpeedPerHour > 10000) {
            this.status = Rocket.STATUS_FLYING;
        } else if (
            this.kmSpeedPerHour == 0 &&
            this.status != Rocket.STATUS_TAKE_OFF
        ) {
            this.status = Rocket.STATUS_FLOATING;
        }
    }
}
