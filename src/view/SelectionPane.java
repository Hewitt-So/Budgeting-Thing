package view;

import controller.AddItemController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import model.BudgetModel;

import java.util.Arrays;
import java.util.List;

public class SelectionPane extends GridPane {
    private List<String> itemList = Arrays.asList("E");
    private ComboBox<String> itembox;
    private TextField amountfield;
    private Button addbutton;


    public SelectionPane (BudgetModel model, AddItemController controller) {
        //TODO: Need to add a function to something to retrieve all items saved in file
        Text itemtext = new Text("Item");

        Text amounttext = new Text("Amount");

        ObservableList<String> items = FXCollections.observableArrayList(itemList);
        itembox = new ComboBox<>(items);
        itembox.setEditable(true);

        amountfield = new TextField();

        addbutton = new Button("Add Item");

        this.setAlignment(Pos.TOP_CENTER);

        this.setMinSize(600,600);
        this.add(itemtext, 0, 0);
        this.add(amounttext, 1, 0);
        this.add(itembox, 1, 1);
        this.add(amountfield, 2, 1);
        this.add(addbutton, 3, 1);
    }
    public String getAmount(){
        return amountfield.getText();
    }
    public String getItem(){
        return itembox.getSelectionModel().getSelectedItem();
    }
    public void setController(AddItemController controller) {
        addbutton.setOnAction(controller);
    }
}
