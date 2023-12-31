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
public abstract class Meteor {
    protected int speed;
    protected int size;
    
    abstract public int calculateDamage();
    
    public void hit(Rocket rocket) {
        rocket.setHealthPoint(rocket.getHealthPoint() - this.calculateDamage());
    }
}

// interface Meteor {
//     abstract public int calculateDamage();
//     public void hit(Rocket rocket);
// }