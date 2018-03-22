/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Recette;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import utils.DataSource;


/**
 *
 * @author Siala
 */
public class RecetteService {
      Connection connection;

    public RecetteService() {
        connection = DataSource.getInsatance().getConnection();
    }
        public void add(Recette r) {
            System.out.println(r.toString());
        String req = "insert into recette (iduser,nom,type,description,nom_image,cout,temps_preparation,temps_repos,temps_cuisson,nb_personne,difficulte,astuces,ingredients,etapes )"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement;
    //    java.util.Date date = new java.util.Date();
     //   java.sql.Date date_sql = new java.sql.Date(date.getTime());

        try {
            preparedStatement = connection.prepareStatement(req);
            
            preparedStatement.setInt(1, r.getIduser().getId());
            preparedStatement.setString(2, r.getNom());
            preparedStatement.setString(3, r.getType());
            preparedStatement.setString(4, r.getDescription());
            preparedStatement.setString(5, r.getNom_image());
            preparedStatement.setString(6, r.getCout());
            
            
        /*    preparedStatement.setDate(7, date_sql);
            preparedStatement.setDate(8, date_sql);
            preparedStatement.setDate(9, date_sql); */
            
                preparedStatement.setTime(7, r.getTemps_preparation()); 
            preparedStatement.setTime(8, r.getTemps_repos()); 
            preparedStatement.setTime(9, r.getTemps_cuisson()); 
            
            preparedStatement.setInt(10, r.getNb_personne()); 
            preparedStatement.setString(11, r.getDifficulte());
            preparedStatement.setString(12, r.getAstuces());      
            preparedStatement.setString(13, r.getIngredients());  
            preparedStatement.setString(14, r.getEtapes()); 
                       

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            // throw new RuntimeException(ex); 
             ex.printStackTrace();
        }
    }


}
