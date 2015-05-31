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
public class Shell<T> extends Sort<T> {

    @Override
    public void sort(List<Comparable<T>> a) {
        int h = 1;
        while (h < a.size() / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < a.size(); ++i) {
                for (int j = i; j >=h && less(a.get(j),(T)a.get(j - h)); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h /= 3;
        }
    }
    
}
