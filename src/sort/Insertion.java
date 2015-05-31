/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.List;

/**
 *
 * @author margarita
 */
public class Insertion<T> extends Sort<T> {

    @Override
    public void sort(List<Comparable<T>> a) {
        for (int i = 0; i < a.size(); ++i) {
            for (int j = i; (j > 0 && less(a.get(j), (T)a.get(j - 1))); --j) {
                exch(a, j, j - 1);
            }
        }
    }
    
}
