package model;

import java.util.Observable;
import java.util.Observer;

public class BudgetModel extends Observable{
    public String curritem;
    public int curramount;
    public void addEntry(String item, int amount) {
        System.out.println(item);
        System.out.println(amount);
        this.curritem = item;
        this.curramount = amount;
        this.setChanged();
        this.notifyObservers();
    }

    public String getcurritem() {
        return curritem;
    }
    public int getcurramount() {
        return curramount;
    }
    //TODO: Add to a list that maybe can save to a file so can store

}
