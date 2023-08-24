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
public class StoneMeteor extends Meteor {
    public StoneMeteor(
        int speed,
        int size
    ) {
        this.speed = speed;
        this.size = size;
    }
    
    @Override
    public int calculateDamage() {
        return this.speed * this.size;
    }
}

//public class StoneMeteor implements Meteor {
//    public int speed;
//    public int size;
//    
//    public StoneMeteor(
//        int speed,
//        int size
//    ) {
//        this.speed = speed;
//        this.size = size;
//    }
//    
//    @Override
//    public int calculateDamage() {
//        return this.speed * this.size;
//    }
//    
//    @Override
//    public void hit(Rocket rocket) {
//        rocket.setHealthPoint(rocket.getHealthPoint() - this.calculateDamage());
//    }
//}
