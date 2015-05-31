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
public abstract class SemipreciousStone extends Stone {

    public SemipreciousStone(float weight, int opacity) {
        super(weight, opacity);
        //setCost(2);
    }
    
    @Override
    public float getValue() {
        return 200 * getCost() * getWeight();
    }
    
}


