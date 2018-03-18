/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import Interface.IUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entities.User;

import service.UserService;
/**
 *
 * @author Siala
 */
public class Session {
      public static IUser iuserService =new UserService();
    public  static User LoggedUser ;
    


    public Session() {
    }

   

    public User getLoggedUser() {
        return LoggedUser;
    }

    

    public  void setLoggedUser(User LoggedUser) {
        Session.LoggedUser = LoggedUser;
    }

  
    
    /**
     *
     * @param login
     * @return
     * @throws SQLException
     */
    public User SetLoggedUser (String login ) throws SQLException{
       Connection connection;
         connection = DataSource.getInsatance().getConnection();
               
        String sql = "SELECT * FROM fos_user WHERE login=? " ;
        
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, login);
        
        ResultSet resultSet = pst.executeQuery();
        if(resultSet.next()){
         LoggedUser = new User(); 
        LoggedUser.setId(resultSet.getInt("id") );  
        LoggedUser = iuserService.findById(LoggedUser.getId());
        }
        
       
        return LoggedUser;   
    
    }

}
