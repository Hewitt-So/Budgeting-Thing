package view;

import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import model.BudgetModel;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class HistoryPane extends GridPane implements Observer {
    private final BudgetModel model;
    private int count = 1;
    //private Text curritem;
    //private Text curramount;
    private ArrayList<String> itemlist = new ArrayList<>();
    private ArrayList<Integer> amountlist = new ArrayList<>();
    public HistoryPane(BudgetModel model) {
        this.model = model;
        //Text curritem = new Text("curri");
        //Text curramount = new Text("curra");
        this.setMinSize(600, 600);
        this.setAlignment(Pos.TOP_CENTER);

        //this.add(curritem, 0, 0);
        //this.add(curramount, 1, 0);
    }

    /**
     * Add item and amount values into corresponding arraylist
     * Can track order via index number?
     * @param citem
     * @param camount
     */
    private void addEntry(String citem, int camount){
        itemlist.add(citem);
        amountlist.add(camount);
        Text item = new Text(citem);
        Text amount = new Text(camount + "");
        this.add(item, 0, this.count);
        this.add(amount, 1, this.count);
        this.count += 1;
    }


    @Override
    public void update(Observable o, Object arg) {
        String ci = model.getcurritem();
        int ca = model.getcurramount();
        this.addEntry(ci, ca);
    }
}
