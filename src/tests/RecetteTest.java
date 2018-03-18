/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import Interface.IUser;
import entities.User;
import service.UserService;
/**
 *
 * @author Siala
 */
public class RecetteTest {
      /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args)  {
        // TODO code application logic here
      System.out.print("hello test");
      /******* add user *********/
     /* User u2 = new User("M", "M.M@esprit.tn", "55676850","a:0:{}");
       UserService userService = new UserService();
       // IUser userService = new UserService();
       
        userService.add(u2); */
       /******* update user *********/
   /*  User u3= new User();
     u3.setId(13);
     u3.setUsername("hello");
     u3.setUsername_canonical("hello");
     u3.setEmail("mm@email.com");
     u3.setEmail_canonical("mm@email.com");
     u3.setEnabled(1);
     u3.setPassword("123");
     u3.setRoles("a:0:{}"); 
       UserService userService = new UserService(); 
         
        userService.update(u3); */
   /******* user all list *********/
   UserService userService = new UserService(); 
   userService.getAll();
   System.out.println(userService.getAll()); 
       
    }
}
