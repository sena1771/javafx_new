import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception  {
        Parent root= FXMLLoader.load(getClass().getResource("asdfg.fxml"));
        primaryStage.setTitle("Hi");
       Scene scene=new Scene(root);
        //primaryStage.setScene(new Scene(root,280,356)); //to see all of the screen do not add width and height
       // scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        String css=this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css); //choose to write like this not the first one!!!
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static  void main(String[] args) { launch(args);}
}