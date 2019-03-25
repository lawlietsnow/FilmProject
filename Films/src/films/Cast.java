/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films;

import javafx.scene.image.Image;

/**
 *
 * @author L
 */
public class Cast {
    String name;
    Image image;
    public Cast(String name) {
        this.name = name;
    }

    public Cast() {
    }

    @Override
    public String toString() {
        return name;
    }
    
}
