/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author L
 */
public class function {
    public static ArrayList<Movie> inItFilms(){
        ArrayList<Movie> list=new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\films\\newfile.txt"));
            String str = br.readLine();
            while (str != null) {
                if (str.length()!=0) {
                    if(str.contains("+")){
                        FileInputStream file=new FileInputStream(new File(str.substring(str.indexOf("+")+1)));
                        Image image=new Image(file);
                        list.add(new Movie(str.substring(0, str.indexOf("+")),image));
                    }else list.add(new Movie(str));
                }
                str = br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return list;
    }
}
//str.substring(str.indexOf("+")+1)