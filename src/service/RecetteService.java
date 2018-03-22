/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Recette;
import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
        
         ObservableList<Recette> getByUser(int Iduser ){
            ObservableList<Recette> listereclamation=FXCollections.observableArrayList();
       String req="select * from recette where iduser=? ";
       PreparedStatement preparedStatement;
       try {
           preparedStatement=connection.prepareStatement(req);
           preparedStatement.setInt(1,Iduser);
           ResultSet resultSet=preparedStatement.executeQuery();
           while(resultSet.next()){
              Recette r= new Recette(resultSet.getInt(1),
                       new UserService().findById(resultSet.getInt(2)),
                      resultSet.getString(3),
                      resultSet.getString(4),
                      resultSet.getString(5),
                      resultSet.getString(6),
                      resultSet.getString(7),
                      resultSet.getTime(8) , 
                      resultSet.getTime(9) ,
                      resultSet.getTime(10) ,
                      resultSet.getInt(11) ,
                       resultSet.getString(12),
                      resultSet.getString(13),
                      resultSet.getString(14),
                      resultSet.getString(15)
                      
                      
                      );
               listereclamation.add(r);
               
           }
       }catch (SQLException ex){
           Logger.getLogger(RecetteService.class.getName()).log(Level.SEVERE, null , ex);
           
       }
        
        
        
        return listereclamation;
             
         }


}
