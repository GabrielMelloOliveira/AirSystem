package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author User
 */

public class Manage_Aircraft_Model extends Application {
    
    public String fxml = "Manage_Aircraft_Model";
    
    public String title_manage_aircraft_model;
    
    public static Stage stage;

    public static Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/" + fxml + ".fxml"));
        
        Scene scene = new Scene(root);
        
        scene.getStylesheets().add("CSS/Estilo.css");
        
        stage.setScene(scene);
        this.stage = stage;
        stage.setTitle(title_manage_aircraft_model + " - AirSystem");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
