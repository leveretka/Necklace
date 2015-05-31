/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stones;

/**
 *
 * @author margarita
 */
public class Emerald extends Gem {
    public Emerald(float weight, int opacity) {
            super(weight, opacity);
            super.setCost(4);
        }
}
