/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.meteor;

import spacewar.rocket.Rocket;

/**
 *
 * @author novil
 */
public class FireballMeteor extends Meteor {
    public int temperature;
    
    public FireballMeteor(
        int speed,
        int size,
        int temperature
    ) {
        this.speed = speed;
        this.size = size;
        this.temperature = temperature;
    }
    
    @Override
    public int calculateDamage() {
        return (this.speed * this.size) + this.temperature;
    }
}
