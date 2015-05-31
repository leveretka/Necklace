/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import stones.Agate;
import stones.Amethyst;
import stones.Dimond;
import stones.Emerald;
import stones.SemipreciousStone.*;
import stones.Gem.*;
import stones.Hyacinth;
import stones.Onyx;
import stones.Ruby;
import stones.Sapphire;
import stones.Stone;
import stones.Topaz;

/**
 *
 * @author margarita
 */
abstract public class ConcreteStoneFactory {
    
    public abstract Stone create(int opacity, float weight);
}

class DimondFactory extends ConcreteStoneFactory {

    @Override
    public Stone create(int opacity, float weight) {
        return new Dimond(weight, opacity);
    }
    
}

class RubyFactory extends ConcreteStoneFactory {

    @Override
    public Stone create(int opacity, float weight) {
        return new Ruby(weight, opacity);
    }
    
}

class SapphireFactory extends ConcreteStoneFactory {

    @Override
    public Stone create(int opacity, float weight) {
        return new Sapphire(weight, opacity);
    }
    
}

class TopazFactory extends ConcreteStoneFactory {

    @Override
    public Stone create(int opacity, float weight) {
        return new Topaz(weight, opacity);
    }
    
}

class EmeraldFactory extends ConcreteStoneFactory {

    @Override
    public Stone create(int opacity, float weight) {
        return new Emerald(weight, opacity);
    }
    
}

class AgateFactory extends ConcreteStoneFactory {

    @Override
    public Stone create(int opacity, float weight) {
        return new Agate(weight, opacity);
    }
    
}

class AmethystFactory extends ConcreteStoneFactory {

    @Override
    public Stone create(int opacity, float weight) {
        return new Amethyst(weight, opacity);
    }
    
}

class HyacinthFactory extends ConcreteStoneFactory {

    @Override
    public Stone create(int opacity, float weight) {
        return new Hyacinth(weight, opacity);
    }
    
}

class OnyxFactory extends ConcreteStoneFactory {

    @Override
    public Stone create(int opacity, float weight) {
        return new Onyx(weight, opacity);
    }
    
}