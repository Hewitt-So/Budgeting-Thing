package view;

import controller.AddItemController;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.BudgetModel;

public class View {
    private final Stage stage;
    private final BudgetModel budgetModel;
    private final AddItemController controller;
    private final GridPane selectionPane;
    private final GridPane historyPane;
    public View (BudgetModel model, Stage stage){
        this.budgetModel = model;
        this.stage = stage;
        this.controller = new AddItemController(this.budgetModel);
        this.selectionPane = new SelectionPane(this.budgetModel, this.controller);
        this.historyPane = new HistoryPane(this.budgetModel);

        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        root.add(selectionPane,0,0);
        root.add(historyPane,0,1);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Budgeting Thing");
        stage.setResizable(false);
        stage.show();
    }
}
