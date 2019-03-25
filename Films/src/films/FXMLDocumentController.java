/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author L
 */
public class FXMLDocumentController implements Initializable {

    static Stage addStage;

    @FXML
    void add(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("add.fxml"));
        addStage = new Stage();
        addStage.setScene(new Scene(root));
        addStage.show();
    }

    @FXML
    void showList(ActionEvent e) throws IOException {
        Stage stage=new Stage();
        Parent root=FXMLLoader.load(getClass().getResource("show.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
