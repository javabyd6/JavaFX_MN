package Controller;

import Pogoda.Pogoda;
import Pogoda.SerwisPogody;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author nieckarz
 */
public class RootController implements Initializable {
    private String degresC = String.valueOf((char) 176) + "C";
    private String degress = String.valueOf((char) 176);
    @FXML
    private Button search;

    @FXML
    private TextField city;

    @FXML
    private Label TemperatureIn;

    @FXML
    private Label country;

    @FXML
    private Label region;

    @FXML
    private Label plat;

    @FXML
    private Label plon;

    @FXML
    private Label localTimeCity;

    @FXML
    private Label temp_real;

    public void initialize(URL location, ResourceBundle resources) {

        city.setText("Podaj nazwę Miasta");
        TemperatureIn.setText(degresC);


    }

    public void setCity(){

        SerwisPogody serwisPogody = new SerwisPogody();
        Pogoda pogoda = serwisPogody.getCityPogoda(city.getText());
        TemperatureIn.setText(String.valueOf(pogoda.getCurrent().getFeelslike_c())+ degresC);
        country.setText(pogoda.getLocation().getCountry());
        region.setText(pogoda.getLocation().getRegion());
        plat.setText(String.valueOf(pogoda.getLocation().getLat())+degress);
        plon.setText(String.valueOf(pogoda.getLocation().getLon())+degress);
        localTimeCity.setText(pogoda.getLocation().getLocaltime());
        temp_real.setText(String.valueOf(pogoda.getCurrent().getTemp_c())+degresC);
    }
}
