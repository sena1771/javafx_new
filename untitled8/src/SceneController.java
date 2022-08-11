import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;


public class SceneController implements Initializable {
private Stage stage;
private Scene scene;
private Parent root;
@FXML
private Label select;
@FXML
private RadioButton pizza,burger,meat;
@FXML
private CheckBox checkBox;
@FXML
private Label off;
@FXML
private ImageView viewimage;
@FXML
private Label label1;
@FXML
private DatePicker date;
@FXML
 private ColorPicker colorpicker;
@FXML
 private Pane pane;
@FXML
private Label selecting;
@FXML
private ChoiceBox<String> choice; //taking the choices as a string
    private String[] food={"pizza","burger","meat"};
Image myImage=new Image(getClass().getResourceAsStream("Untitled.png"));
Image myImage1=new Image(getClass().getResourceAsStream("light.jpg"));
public void switchingScene(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("aa.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void change(ActionEvent event1){
       if(checkBox.isSelected())  { //selected choice for checkboxes
               off.setText("ON");
               viewimage.setImage(myImage1);
       }
       else {
               off.setText("OFF");
               viewimage.setImage(myImage);
       }
    }
    public void food(ActionEvent event) { //method for radio buttons
    if(pizza.isSelected()) {
       select.setText(pizza.getText());
    } else if(burger.isSelected()){
        select.setText(burger.getText());
    }else if (meat.isSelected()){
        select.setText(meat.getText());
    }
}public void getDate(ActionEvent event) { //getting the date
    LocalDate localDate = date.getValue();
    label1.setText(localDate.toString());
}
public void changeColor(ActionEvent event){ //changing the background's color
    Color newColor=colorpicker.getValue();
    pane.setBackground(new Background(new BackgroundFill(newColor,null, Insets.EMPTY)));
}
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
   choice.getItems().addAll(food);//added all items to the choicebox
   choice.setOnAction(this::getFood);

}
public void getFood(ActionEvent event){ //for getting the items with getvalue for choicebox
    String myFood=choice.getValue();
    selecting.setText(myFood);
}
}
