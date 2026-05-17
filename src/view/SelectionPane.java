package view;

import controller.AddItemController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import model.BudgetModel;

public class SelectionPane extends GridPane {
    public SelectionPane (BudgetModel model, AddItemController controller) {
        Text itemtext = new Text("Item");
        Text amounttext = new Text("Amount");
        TextField itemfield = new TextField();
        TextField amountfield = new TextField();
        Button addbutton = new Button("Add Item");
        addbutton.setOnAction(controller);
        this.setAlignment(Pos.TOP_CENTER);

        this.setMinSize(600,600);
        this.add(itemtext, 0, 0);
        this.add(amounttext, 1, 0);
        this.add(itemfield, 1, 1);
        this.add(amountfield, 2, 1);
        this.add(addbutton, 3, 1);
    }
}
