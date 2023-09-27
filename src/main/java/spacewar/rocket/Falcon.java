/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.rocket;

import spacewar.weapon.Laser;
import spacewar.weapon.Flamethrower;

/**
 *
 * @author novil
 */
public final class Falcon extends Rocket {
    
    public final void shoot(Laser laser, Rocket target) {
        target.setHealthPoint(target.getHealthPoint() - laser.damage);
        laser.sound();
    }
    
    public final void shoot(Flamethrower flamethrower, Rocket target) {
        target.setHealthPoint(target.getHealthPoint() - flamethrower.damage);
        flamethrower.sound();
    }
    
//    public void shoot(Laser laser, Rocket target) {
//        target.setHealthPoint(target.getHealthPoint() - laser.damage);
//    }
//    
//    public void shoot(Flamethrower flamethrower, Rocket target) {
//        target.setHealthPoint(target.getHealthPoint() - flamethrower.damage);
//    }
    
//    public void shootLaser(Laser laser, Rocket target) {
//        target.setHealthPoint(target.getHealthPoint() - laser.damage);
//    }
//    
//    public void shootFlamethrower(Flamethrower flamethrower, Rocket target) {
//        target.setHealthPoint(target.getHealthPoint() - flamethrower.damage);
//    }
    
//    public int kmSpeedPerHour = 28000;
//    public final int fuelCapacityInLiter = 300;
}
