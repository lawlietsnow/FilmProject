/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author L
 */
public class DetailController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    ImageView imageView;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        imageView.setImage(ShowController.movie.image);
    }    
    
}
