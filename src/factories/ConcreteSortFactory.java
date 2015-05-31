/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import sort.Insertion;
import sort.Quick;
import sort.Selection;
import sort.Shell;
import sort.Sort;

/**
 *
 * @author margarita
 */
public abstract class ConcreteSortFactory {
    
    public abstract Sort getSortMethod();
    
}

class InsertionFactory extends ConcreteSortFactory {

    @Override
    public Sort getSortMethod() {
        return new Insertion();
    }
    
}

class SelectionFactory extends ConcreteSortFactory {

    @Override
    public Sort getSortMethod() {
        return new Selection();
    }
    
}

class ShellFactory extends ConcreteSortFactory {

    @Override
    public Sort getSortMethod() {
        return new Shell(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class QuickFactory extends ConcreteSortFactory {

    @Override
    public Sort getSortMethod() {
        return new Quick(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
