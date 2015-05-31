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
public abstract class Sort<T> {
    
    public abstract void sort(List<Comparable<T>> a);
    
    boolean less(Comparable<T> a, T b) {
        return a.compareTo(b) < 0;
    }
    
    void exch(List<Comparable<T>> a, int i, int j) {
        Comparable t = a.get(i);
        a.add(i, a.get(j));
        a.remove(i + 1);
        a.add(j, t);
        a.remove(j + 1);
    }
    
    boolean isSorted(List<Comparable<T>> a) {
        for (int i = 1; i < a.size(); ++i) {
            if (less(a.get(i), (T)a.get(i - 1))) {
                return false;
            }
        }
        return true;
    }
    
    public String show(List<Comparable<T>> a) {
        String res = "";
        for (Comparable<T> c: a) {
            res += c;
            res += "\n";
        }
        return res;
    }
}
