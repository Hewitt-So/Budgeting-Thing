package view;

import controller.AddItemController;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.BudgetModel;

import java.util.Observer;

public class View {
    private final Stage stage;

    public View (BudgetModel model, Stage stage){
        this.stage = stage;
        SelectionPane selectionPane = new SelectionPane(model, null);
        AddItemController controller = new AddItemController(model, selectionPane);
        selectionPane.setController(controller);
        HistoryPane historyPane = new HistoryPane(model);
        model.addObserver(historyPane);

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
