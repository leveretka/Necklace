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
public class Selection<T> extends Sort<T> {

    @Override
    public void sort(List<Comparable<T>> a) {
        for (int i = 0; i < a.size(); ++ i) {
            int min = i;
            for (int j = i + 1; j < a.size(); ++j) {
                if (less(a.get(j), (T)a.get(min))) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    
}
