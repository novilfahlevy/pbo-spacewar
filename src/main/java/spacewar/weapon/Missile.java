/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.weapon;

/**
 *
 * @author novil
 */
public class Missile extends Weapon {
    public Missile() {
        this.damage = 60;
    }
    
    @Override
    public void sound() {
        System.out.println("Duarr..");
    }
}
