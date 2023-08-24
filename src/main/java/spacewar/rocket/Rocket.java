/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.rocket;

import spacewar.weapon.Weapon;

/**
 *
 * @author novil
 */
public class Rocket {
    
    public int healthPoint = 100;
    
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
        
        if (this.healthPoint < 0) {
            this.healthPoint = 0;
        }
    }
    
    public static int STATUS_NON_ACTIVE = 0;
    public static int STATUS_TAKE_OFF = 1;
    public static int STATUS_FLYING = 2;
    public static int STATUS_FLOATING = 3;
    
    public int status = Rocket.STATUS_NON_ACTIVE;
    
    // jumlah tempat duduk
    final public int numberOfSeats = 4;
    
    public int kmSpeedPerHour = 28000;
    
    private int fuel = 0;
    private int fuelCapacity = 300;
    
    public Rocket() {
        // System.out.println("Rocket was constructed and ready to go.");
    }

    public void setFuel(int fuel) {
        if (fuel >= this.fuelCapacity) {
            this.fuel = this.fuelCapacity;
        } else {
            this.fuel = fuel;
        }
    }

    public int getFuel() {
        // tambahkan proses yang diperlukan
        return this.fuel;
    }
    
    public void updateRocketStatus() {
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
