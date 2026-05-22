package model;

import view.Entry;

import java.util.Observable;
import java.util.Observer;

public class BudgetModel extends Observable{
    public Entry currentry;
    public int total = 0;
    public void addEntry(String item, int amount) {
        this.currentry = new Entry(item, amount);
        this.total = this.total + amount;
        this.setChanged();
        this.notifyObservers();
    }
    public int getTotal() {
        return this.total;
    }

    //TODO: Add to a list that maybe can save to a file so can store

}
