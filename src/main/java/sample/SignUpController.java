package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private Button button_signup;
    @FXML
    private Button button_login;

    @FXML
    private RadioButton rb_yes;
    @FXML
    private RadioButton rb_no;

    @FXML
    private TextField tf_usrname;
    @FXML
    private TextField tf_password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button_signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ToggleGroup toggleGroup = new ToggleGroup();
                rb_yes.setToggleGroup(toggleGroup);
                rb_no.setToggleGroup(toggleGroup);

                rb_yes.setSelected(true);

                button_signup.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String toggleName = ((RadioButton) toggleGroup.getSelectedToggle()).getText();
                        if (!tf_usrname.getText().trim().isEmpty() && !tf_password.getText().trim().isEmpty()) {
                            DBUltils.signUpUser(event, tf_usrname.getText(), tf_password.getText());
                        }
                        else {
                            System.out.println("Fill in all informations !");
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("Fill in all the informations");
                            alert.show();
                        }
                    }
                });
            }
        });

        button_login.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                DBUltils.changeScence(event,"sample.fxml", "Log in!", null);
            }
        });
    }
}
