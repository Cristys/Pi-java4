/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.util.List;
import entities.User;

/**
 *
 * @author Siala
 */
public interface IUser extends IService <User, Integer> {

   
    public boolean findByLogin (String s);
    public User UserByLogin (String s);
    public boolean findByPassword (String s);
    public String Getrole(String s);
    
  
   
    
}
