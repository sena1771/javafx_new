import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
public class AaController {
    @FXML
    TextField nameTextField;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event2) throws IOException {
        String username=nameTextField.getText();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("data.fxml"));
        root=loader.load(); //you can get the fxml file with this approach too
        DataController dataController=loader.getController(); //communication between two controller
        dataController.displayName(username); //communications continue
        stage=(Stage)((Node)event2.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
