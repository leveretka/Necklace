/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import stones.Stone;
import factories.AbstractFactory;
import factories.SortType;
import factories.StoneType;
import sort.Sort;

/**
 * Class for storing different stones in a necklace.
 * @author margarita
 */
public class Necklace {
    
    private List<Stone> stones;

    /**
     * Class constructor.
     * @param stones list of stones our necklace consits of
     */
    public Necklace(List<Stone> stones) {
        this.stones = stones;
    }

    /**
     * Empty class constructor.
     */
    public Necklace() {
        stones = new ArrayList<>();
    }
    
    /**
     * Adds a stone in current necklace.
     * @param stone stone we want to add
     */
    public void add(Stone stone) {
        stones.add(stone);
    }
    
    /**
     * Removes given stone from current necklace.
     * @param stone stone we want to remove
     */
    public void remove(Stone stone) {
        stones.remove(stone);
    }
    
    /**
     * Calculates the cost of the whole necklace.
     * @return sum of costs of all stones in this necklace
     */
    public float totalCost() {
        float cost = 0;
        for (Stone s: stones) {
            cost += s.getValue();
        }
        return cost;
    }

    /**
     * Calculates the weight of the whole necklace.
     * @return sum of weights of all stones in this necklace
     */    
    public float totalWeight() {
        float cost = 0;
        for (Stone s: stones) {
            cost += s.getWeight();
        }
        return cost;
    }
    
    /**
     * Finds stones having opacity in given range.
     * @param lower the lowest opacity required
     * @param upper the highest opacity required
     * @return list of stones with needed opacity
     */
    public List<Stone> findbyOpacity(int lower, int upper) {
        List<Stone> list = new ArrayList<>();
        for (Stone s: stones) {
            if (s.getOpacity() <= upper && s.getOpacity() >= lower) {
                list.add(s);
            }
        }
        return list;
    }
    
    /**
     * Sorts stones in this necklace by value.
     * @param st sort method we want to use
     */
    public void sort (SortType st) {
        Sort sortMethod = AbstractFactory.getSortFactory(st)
                .getSortMethod();
        
        sortMethod.sort(stones);
        
    }
    
    /**
     * Reads stones from file and adds it in this necklace.
     * @param fileName file we want to read stones from
     */
    public void readStones(String fileName) {
        String s;
        Scanner in;
        try {
            in = new Scanner(new File(fileName));
            while(in.hasNext()) {
                s = in.nextLine();
                String str[] = s.split("\\s");
                stones.add(AbstractFactory.getStoneFactory(StoneType
                        .valueOf(str[0]))
                        .create(Integer.parseInt(str[1])
                                , Float.parseFloat(str[2])));
            }

        } catch (FileNotFoundException 
                | IndexOutOfBoundsException 
                | NumberFormatException ex) {
            Logger.getLogger(Necklace.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @Override
    public String toString() {
        String res = "";
        res += "\t\tNecklace:\n";
        for (Stone s: stones) {
            res += s.toString();
            res += "\n";
        }
        return res;
    }
}
