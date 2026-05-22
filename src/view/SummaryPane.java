package view;

import controller.AddItemController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import model.BudgetModel;

import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class SummaryPane extends GridPane implements Observer {
    private List<String> itemList = Arrays.asList("Total", "Monthly");
    private ComboBox<String> categorycombo;
    private Text symbol;
    private Text total;
    private BudgetModel model;


    public SummaryPane (BudgetModel model, AddItemController controller) {
        this.model = model;
        ObservableList<String> items = FXCollections.observableArrayList(itemList);
        categorycombo = new ComboBox<>(items);
        categorycombo.setEditable(true);
        symbol = new Text("$");
        total = new Text("-");
        categorycombo.setValue(itemList.get(0));

        this.setAlignment(Pos.TOP_CENTER);

        this.add(categorycombo, 0, 0);
        this.setMargin(categorycombo, new Insets(0,10,0,0));
        this.add(symbol, 1, 0);
        this.add(total, 2, 0);
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
        total.setText(model.getTotal() + "");
    }
}
