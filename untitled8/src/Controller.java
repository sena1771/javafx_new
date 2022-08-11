import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {
    @FXML
    private Circle circle;
    private Stage stage;
    private Scene scene;
    private double x;
    private double y;

    public void down(ActionEvent actionEvent) {
        //System.out.println("DOWN BUTTON");
        circle.setCenterY(y-=1); //for moving the circle through the y axis
    }
    public void enter(ActionEvent actionEvent) {
        //System.out.println("ENTER BUTTON");
        circle.setCenterX(x+=1);
    }

    public void switchingScene1(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("scene.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
