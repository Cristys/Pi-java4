/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Interface.IUser;
import entities.User;
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
public class UserService implements IUser  {
    Connection connection;

    public UserService() {
        connection = DataSource.getInsatance().getConnection();
    }

    @Override
    public void add(User u) {
        try {
            System.out.println(u.toString());
            String requete = "INSERT INTO fos_user"
                    + " (username,username_canonical,email,email_canonical,enabled,password,roles) "
                    + "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(requete);
            pst.setString(1, u.getUsername());
            pst.setString(2, u.getUsername());
             pst.setString(3, u.getEmail());
            pst.setString(4, u.getEmail());
           // pst.setInt(5,u.getEnabled() );
           pst.setInt(5,1 );
            pst.setString(6, u.getPassword());
            pst.setString(7, u.getRoles());
          
           
           
            pst.executeUpdate();
            System.out.println("Insertion effectué avec succés");
        } catch (SQLException ex) {
         //  throw new RuntimeException(ex); 
        }
    } 
     @Override
    public void update(User u) {
        try {
            System.out.println(u.toString());
            String requete = "update fos_user set username=?,username_canonical=?,email=?,email_canonical=?,enabled=?, password=?, roles=? where id=?";
            PreparedStatement pst = connection.prepareStatement(requete);
             pst.setString(1, u.getUsername());
            pst.setString(2, u.getUsername());
             pst.setString(3, u.getEmail());
            pst.setString(4, u.getEmail());
           pst.setInt(5,1 );
          
            pst.setString(6, u.getPassword());
           
            pst.setString(7, u.getRoles());
            

            pst.setInt(8, u.getId());
            
            pst.executeUpdate();
            System.out.println("Modification effectué avec succés");
        } catch (SQLException ex) {
           //  throw new RuntimeException(ex); 
        }
    }
     @Override
    public List<User> getAll() {
        List<User> user = new ArrayList<>();
        String req = "select * from fos_user";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                User u = new User(resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("Email"),
                      
                
                        resultSet.getString("password"),
                      
                        resultSet.getString("roles")
                       );
                user.add(u);
             
            }
        } catch (SQLException ex) {
           // ex.printStackTrace();
        }
        return user;
    }
     @Override
    public void remove(Integer r) {
        try {
            String requete = "delete from fos_user where id=?";
            PreparedStatement ps = connection.prepareStatement(requete);

            ps.setInt(1, r);

            ps.executeUpdate();
            System.out.println("remove sucess");
        } catch (SQLException ex) {
           // ex.printStackTrace();
        }
        
    }
     @Override    
    public User findById(Integer r) {
        User user = null;
        String req = "select * from fos_user where id =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, r);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User(resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("Email"),
                        resultSet.getString("password"),
                        resultSet.getString("roles")
                );
            }
        } catch (SQLException ex) {
       
           // ex.printStackTrace();
        }
        return user;
    }
     @Override
    public boolean findByLogin(String s) {
        User user = null;
        String req = "select * from fos_user where username =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, s);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User(resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("Email"),
                        resultSet.getString("password"),
                        resultSet.getString("roles"));
            }
        } catch (SQLException ex) {
         //   ex.printStackTrace();
        }
        return user != null;
    }
     @Override        
    public User UserByLogin(String s) {
        User user = null;
        String req = "select * from fos_user where username =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, s);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User(resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("Email"),
                        resultSet.getString("password"),
                        resultSet.getString("roles"));
            }
        } catch (SQLException ex) {
          //  ex.printStackTrace();
        }

        return user;
    }
     @Override
    public boolean findByPassword(String s) {
        User user = null;
        String req = "select * from fos_user where password =?";

        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, s);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User(resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("Email"),
                        resultSet.getString("password"),
                        resultSet.getString("roles"));
            }
        } catch (SQLException ex) {
           // ex.printStackTrace();
        }
        return user != null;
    }
    


    @Override
    public String Getrole(String s) {
        String s1 = "";
        String req = "select roles from fos_user where username =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, s);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                s1 = resultSet.getString("roles");
            }
        } catch (SQLException ex) {
          //  ex.printStackTrace();
        }
        return s1;
    }
            
   
}
