package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import model.BudgetModel;
import view.SelectionPane;

public class AddItemController implements EventHandler<ActionEvent> {
    private BudgetModel model;
    private SelectionPane selectionPane;
    public AddItemController(BudgetModel model, SelectionPane selectionPane) {
        this.model = model;
        this.selectionPane = selectionPane;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        //TODO: How to get the values of the other textfields in the gridpane?
        String value = selectionPane.getAmount();
        int amount = Integer.parseInt(value);
        String item = selectionPane.getItem();
        model.addEntry(item, amount);
    }
}
