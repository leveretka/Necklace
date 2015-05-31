/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

/**
 *
 * @author margarita
 */

public class AbstractFactory {

    private AbstractFactory() {
    }
    /**
     * 
     * @param st type of stone we want to create
     * @return factory which produces stones of given type
     */
    public static ConcreteStoneFactory getStoneFactory(StoneType st) {
        
        if (st == StoneType.DIMOND) {
            return new DimondFactory();
        }
        
        if (st == StoneType.RUBY) {
            return new RubyFactory();
        }
        
        if (st == StoneType.SAPPHIRE) {
            return new SapphireFactory();
        }
        
        if (st == StoneType.TOPAZ) {
            return new TopazFactory();
        }
        
        if (st == StoneType.EMERALD) {
            return new EmeraldFactory();
        }
        
        if (st == StoneType.AGATE) {
            return new AgateFactory();
        }
        
        if (st == StoneType.AMETHYST) {
            return new AmethystFactory();
        }
        
        if (st == StoneType.HYACINTH) {
            return new HyacinthFactory();
        }
        
        if (st == StoneType.ONYX) {
            return new OnyxFactory();
        }
        return null;
    }
 
    /**
     * 
     * @param st sort method we want to use
     * @return factory which produces object with given sort method
     */
    public static ConcreteSortFactory getSortFactory(SortType st) {
 
        if (st == SortType.INSERTION) {
            return new InsertionFactory();
        }
        
        if (st == SortType.SELECTION) {
            return new SelectionFactory();
        }
        
        if (st == SortType.SHELL) {
            return new ShellFactory();
        }
        
        if (st == SortType.QUICK) {
            return new QuickFactory();
        }
        
        return new ShellFactory();
    }
}

