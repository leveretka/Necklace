/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import stones.Stone;
import factories.AbstractFactory;
import factories.SortType;

/**
 *
 * @author margarita
 */
public class main {
    public static void main(String[] args) {
        
//        List<Stone> e = new ArrayList<Stone>(){{
//            add(AbstractFactory.getStoneFactory(StoneType.RUBY)
//                    .create(8, 3.4f));
//            add(AbstractFactory.getStoneFactory(StoneType.DIMOND)
//                    .create(1, 5f));
//            add(AbstractFactory.getStoneFactory(StoneType.AGATE)
//                    .create(2, 3.4f));
//            add(AbstractFactory.getStoneFactory(StoneType.AMETHYST)
//                    .create(3, 3.4f));
//            add(AbstractFactory.getStoneFactory(StoneType.EMERALD)
//                    .create(4, 3.3f));
//            add(AbstractFactory.getStoneFactory(StoneType.HYACINTH)
//                    .create(5, 3.0f));
//            add(AbstractFactory.getStoneFactory(StoneType.HYACINTH)
//                    .create(6, 3.2f));
//            add(AbstractFactory.getStoneFactory(StoneType.ONYX)
//                    .create(7, 3.5f));
//            add(AbstractFactory.getStoneFactory(StoneType.SAPPHIRE)
//                    .create(7, 3.3f));
//            add(AbstractFactory.getStoneFactory(StoneType.TOPAZ)
//                    .create(5, 3.1f));
//        }};
        
        Necklace necklace = new Necklace();
        necklace.readStones("stones.txt");
        System.out.println("Neclace Total  Cost  is " + necklace.totalCost());
        System.out.println("Neclace Total Weight is " + necklace.totalWeight());
        necklace.sort(SortType.QUICK);
        System.out.println(necklace);
    }
}
