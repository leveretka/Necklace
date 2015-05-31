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
public abstract class Stone implements Comparable<Stone> {
    
    private float weight;
    private int opacity;
    
    float cost; // per 1 carat

    public Stone(float weight, int opacity) {
        if (opacity < 1) {
            opacity = 1;
        }
        if (opacity > 8) {
            opacity = 8;
        }
        if (weight < 0) {
            weight = 0.01f;
        }
        this.weight = weight;
        this.opacity = opacity;
    }

    public float getWeight() {
        return weight;
    }

    public int getOpacity() {
        return opacity;
    }

    public float getValue() {
        return cost * weight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "\n\t" + this.getClass().getSimpleName() + "\n\tOpacity : " + opacity 
                + "\n\tWeight :" + weight 
                + "\n\tCost : " + getValue();
    }
    
    
    
    @Override
    public int compareTo(Stone o) {
        return getValue() > o.getValue()? 1 : (getValue() == o.getValue()? 0 : -1);
    }
    
}
