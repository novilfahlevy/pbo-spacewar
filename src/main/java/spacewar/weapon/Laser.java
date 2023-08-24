/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.weapon;

/**
 *
 * @author novil
 */
public class Laser extends Weapon {
    public Laser() {
        this.damage = 50;
    }
    
    @Override
    public void sound() {
        System.out.println("Pheww..");
    }
}
