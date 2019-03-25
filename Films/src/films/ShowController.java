/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author L
 */
public class ShowController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    ListView<Movie> listView;
    @FXML
    TextField input;
    static Movie movie;
    @FXML
    void clicked(MouseEvent event) throws IOException {
        System.out.println(listView.getSelectionModel().getSelectedItem());
        movie=listView.getSelectionModel().getSelectedItem();
        Stage stage=new Stage();
        Parent root=FXMLLoader.load(getClass().getResource("detail.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList<Movie> obList = FXCollections.observableArrayList();
        ArrayList<Movie> list = null;
        obList.addAll(function.inItFilms());
        
        
        //Sắp xếp obList bằng collection. Tạo Comparator c để chỉ cách sắp xếp cho FXCollection.sort(obList,c);
        Comparator c = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        
        FXCollections.sort(obList, c);
        
        
        FilteredList<Movie> filterList = new FilteredList<>(obList);//filter=>bộ lọc. lọc ra 1 ObservableList từ obList
        input.textProperty().addListener(object->{//hàm thực hiện hành động khi input thay đổi
            String filter = input.getText();
            if (filter == null) {
                filterList.setPredicate(movie -> {
                    return true;//nếu input rỗng thì lấy toàn bộ obList
                });
            } else {
                filterList.setPredicate(movie -> {
                    boolean b;
                    b = movie.name.contains(filter.toLowerCase()) || movie.name.contains(filter.toUpperCase());
                    return b; //ngược lại lấy những movie.name chứa input 
                });
            }
        });
        
        listView.setItems(filterList);
        
        
    }    
    
}
