package Controller;

import static Controller.Choose_Language.map_languages;
import Main.Manage_Aircraft;
import Main.Manage_Aircraft_Manufacturer;
import Main.Manage_Aircraft_Model;
import Main.Manage_Aircraft_Plane;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Manage_AircraftController implements Initializable {

    //Buttons
    @FXML private Button btn_manufacturer, btn_model, btn_aircraft;
    
    void add_css(){
        btn_manufacturer.getStyleClass().add("button_green");
        btn_model.getStyleClass().add("button_green");
        btn_aircraft.getStyleClass().add("button_green");
    }
    
    void action_buttons(){
        btn_manufacturer.setOnMouseClicked(s -> {
            Manage_Aircraft_Manufacturer screen = new Manage_Aircraft_Manufacturer();
            try {
                screen.start(new Stage());
                Manage_Aircraft.getStage().close();
            } catch (Exception ex) {
                Logger.getLogger(Manage_AircraftController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        btn_model.setOnMouseClicked(s -> {
            Manage_Aircraft_Model screen = new Manage_Aircraft_Model();
            try {
                screen.start(new Stage());
                Manage_Aircraft.getStage().close();
            } catch (Exception ex) {
                Logger.getLogger(Manage_AircraftController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        btn_aircraft.setOnMouseClicked(s -> {
            Manage_Aircraft_Plane screen = new Manage_Aircraft_Plane();
            try {
                screen.start(new Stage());
                Manage_Aircraft.getStage().close();
            } catch (Exception ex) {
                Logger.getLogger(Manage_AircraftController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    void language_adaptation(){
        btn_manufacturer.setText(map_languages.get("btn_manufacturer"));
        btn_model.setText(map_languages.get("btn_model"));
        btn_aircraft.setText(map_languages.get("btn_aircraft"));
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        add_css();
        action_buttons();
        language_adaptation();
    }    
    
}
