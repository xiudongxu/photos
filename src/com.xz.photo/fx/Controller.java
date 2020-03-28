package fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField account;
    @FXML private PasswordField password;
    private FXMLTest application;


    public void setApp(FXMLTest application){
        this.application = application;
    }
    @FXML
    public void LOGIN_M(ActionEvent event) {
        application.userlogin(account.getText(), password.getText());
    }

    @FXML
    private void CLEAR_M(ActionEvent event) {
        account.setText(null);
        password.setText(null);
    }

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
