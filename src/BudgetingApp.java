import javafx.application.Application;
import javafx.stage.Stage;
import model.BudgetModel;
import view.View;

public class BudgetingApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        new View(new BudgetModel(), stage);
    }
}