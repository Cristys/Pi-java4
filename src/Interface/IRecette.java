/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import entities.Recette;
import entities.User;
import java.util.List;
import javafx.collections.ObservableList;

/**
 *
 * @author Siala
 */
public interface IRecette extends IService <Recette, Integer>{
     ObservableList<Recette> getByUser(int Iduser );
      ObservableList<Recette> getByType(String Type);
      ObservableList<Recette> getByNom(String Nom);
      ObservableList<Recette> DisplayAll(String Nom);
      
     public Recette findById( int i);
    
}
