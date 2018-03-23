/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Interface.ICommentaire;
import entities.Commentaire;
import entities.Recette;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.DataSource;

/**
 *
 * @author Siala
 */
public class CommentaireService implements ICommentaire {
      Connection connection;

    public CommentaireService() {
        connection = DataSource.getInsatance().getConnection();
    }
    
   @Override
    public void add(Commentaire c) {
            System.out.println(c.toString());
        String req = "insert into commentaire (iduser,idrecette,comment )"
                + " values (?,?,?)";
        PreparedStatement preparedStatement;
  

        try {
            preparedStatement = connection.prepareStatement(req);
            
            preparedStatement.setInt(1, c.getIduser().getId());
            preparedStatement.setInt(2, c.getIdrecette().getId());
            preparedStatement.setString(3, c.getComment());
           
                       

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            // throw new RuntimeException(ex); 
             ex.printStackTrace();
        }
    }

    

    @Override
    public void update(Commentaire t) {
       System.out.println(t.toString());
        String req = "update commentaire set comment=? where id=?)"
                ;
        PreparedStatement preparedStatement;
  

        try {
            preparedStatement = connection.prepareStatement(req);
            
           
            preparedStatement.setString(1, t.getComment());
            preparedStatement.setInt(2, t.getId());
                       

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            // throw new RuntimeException(ex); 
             ex.printStackTrace();
        }
    }

    @Override
    public void remove(Integer r) {
      String req = "delete from commentaire where id =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, r);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Commentaire findById(Integer r) {
     Commentaire commentaire = null;
        String req = "select * from commentaire where id =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, r);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               commentaire= new Commentaire(resultSet.getInt(1),
                       new UserService().findById(resultSet.getInt(2)),
                       new RecetteService().findById(resultSet.getInt(3)),
                      resultSet.getString(4)
                      ); }
        } catch (SQLException ex) {
             ex.printStackTrace();
        }
        return commentaire;
    }

    @Override
    public List<Commentaire> getAll() {
       List<Commentaire> commentaires  = new ArrayList<>();
        String req = "select * from commentaire ";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               Commentaire commentaire= new Commentaire(resultSet.getInt(1),
                      new UserService().findById(resultSet.getInt(2)),
                       new RecetteService().findById(resultSet.getInt(3)),
                      resultSet.getString(4)
                      
                      
                      );
                commentaires.add(commentaire); 
            }
        } catch (SQLException ex) {
        }
        return commentaires ;
    
    }
}
