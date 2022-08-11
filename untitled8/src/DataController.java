import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import javax.imageio.IIOException;
import java.io.IOException;

public class DataController {
    @FXML
    Label nameLabel;
    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane scenePane;
    @FXML
    ImageView Image;
    Stage stage;
    @FXML
     private Label label;
    @FXML
    private TextField textField;
    @FXML
     private Button submit;
    int age;

    Image myImage= new Image(getClass().getResourceAsStream("confirmed.png"));
    public void displayImage() { //change the photo when pressed the button and with mouse entered property you can change it when mouse is on the photo's above
        Image.setImage(myImage);
    }
    public void displayName(String username)  {
        nameLabel.setText("Hello " + username);

    }
    public void logout(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logout");
        alert.setHeaderText("You are about to log out!!!");
        alert.setContentText("Are you sure that you wanna exit???");
        if(alert.showAndWait().get()== ButtonType.OK){
        stage=(Stage)scenePane.getScene().getWindow();
        System.out.println("Successfully logged out");
        stage.close();
    } }
    public void submit(ActionEvent actionEvent)  {
        try {
        age=Integer.parseInt(textField.getText()); //for taking the textfield from user do the parse
        if(age<18){
            label.setText("Must be 18+");
        }
        else {
            label.setText("Succesfully has been entered the system");
        }
    }catch (NumberFormatException e){ //format name is NumberFormatException
           label.setText("Only numbers expected");
        }
    }



}
