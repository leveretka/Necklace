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
public class Quick<T> extends Sort<T> {

    private void sort(List<Comparable<T>> a, int lo, int hi) {
        
        if (hi <= lo) {
            return;
        }
        
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    @Override
    public void sort(List<Comparable<T>> a) {
        sort(a, 0, a.size() - 1);
    }
    
    private int partition(List<Comparable<T>> a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable<T> v = a.get(lo);
        while (true) {
            while (less(a.get(++i), (T)v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, (T)a.get(--j))) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch (a, lo, j);
        return j;
    }
    
}
