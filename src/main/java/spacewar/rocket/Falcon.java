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
public class Falcon extends Rocket {
    public void shoot(Laser laser, Rocket target) {
        target.setHealthPoint(target.healthPoint - laser.damage);
        laser.sound();
    }
    
    public void shoot(Flamethrower flamethrower, Rocket target) {
        target.setHealthPoint(target.healthPoint - flamethrower.damage);
        flamethrower.sound();
    }
}
