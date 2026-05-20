package model;

import view.Entry;

import java.util.Observable;
import java.util.Observer;

public class BudgetModel extends Observable{
    public Entry currentry;
    public void addEntry(String item, int amount) {
        this.currentry = new Entry(item, amount);
        this.setChanged();
        this.notifyObservers();
    }

    //TODO: Add to a list that maybe can save to a file so can store

}
