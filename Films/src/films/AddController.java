/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author L
 */
public class AddController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    TextField name;
    @FXML
    void addFilm(ActionEvent e){
        File file;
        BufferedWriter bw;
        try {
            
            file=new File("src\\films\\newfile.txt");
            FileWriter fw=new FileWriter(file, true);
            bw=new BufferedWriter(fw);
            bw.write("\n"+name.getText());
            bw.close();
            FXMLDocumentController.addStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AddController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    void close(ActionEvent e){
        FXMLDocumentController.addStage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
