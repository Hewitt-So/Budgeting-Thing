package view;

import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import model.BudgetModel;

import java.util.Observable;
import java.util.Observer;

public class HistoryPane extends GridPane implements Observer {
    //private final BudgetModel model;
    private Text curritem;
    private Text curramount;
    public HistoryPane(BudgetModel model) {
        //this.model = model;
        curritem = new Text("");
        curramount = new Text("slides");
        this.setAlignment(Pos.TOP_CENTER);

        this.add(curritem, 0, 0);
        this.add(curramount, 1, 0);
    }
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an {@code Observable} object's
     * {@code notifyObservers} method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the {@code notifyObservers}
     *            method.
     */
    @Override
    public void update(Observable o, Object arg) {
        BudgetModel model = (BudgetModel) o;
        String item = model.getcurritem();
        int amount = model.getcurramount();
        curritem.setText(item);
        curramount.setText(Integer.toString(amount));
    }
}
