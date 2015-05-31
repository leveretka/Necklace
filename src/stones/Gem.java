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
public abstract class Gem extends Stone {

    public Gem(float weight, int opacity) {
        super(weight, opacity);
    }

    @Override
    public float getValue() {
        return 500 * (8 - getOpacity()) + 200 * getWeight() * getCost();
    }
}

