/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films;

import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author L
 */
public class Movie {
    String name;
    Image image=null;
    ArrayList<Cast> listCast;
    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }
    
    public Movie(Movie m){
        name=m.name;
    }
    
    public Movie(String name, Image image){
        this.name =name;
        this.image=image;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
