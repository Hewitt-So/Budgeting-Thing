package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import model.BudgetModel;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class HistoryPane extends TableView implements Observer {
    private final BudgetModel model;
    private int count = 1;
    //private Text curritem;
    //private Text curramount;
    private ArrayList<String> itemlist = new ArrayList<>();
    private ArrayList<Integer> amountlist = new ArrayList<>();
    public HistoryPane(BudgetModel model) {
        this.model = model;
        this.setMinSize(600, 600);
        TableColumn<Entry, String> itemcol = new TableColumn<>("Item");
        itemcol.setCellValueFactory(
                new PropertyValueFactory<>("item"));
        TableColumn<Entry, Integer> amountcol = new TableColumn<>("Amount");
        amountcol.setCellValueFactory(
                new PropertyValueFactory<>("amount"));
        this.getColumns().add(itemcol);
        this.getColumns().add(amountcol);
        this.setPlaceholder(
                new Label("No rows to display"));
    }

    /**
     * Add item and amount values into corresponding arraylist
     * Can track order via index number?
     * @param entry
     */
    private void addEntryToTable(Entry entry){
        this.getItems().add(0,entry);
    }


    @Override
    public void update(Observable o, Object arg) {
        this.addEntryToTable(model.currentry);
    }
}
