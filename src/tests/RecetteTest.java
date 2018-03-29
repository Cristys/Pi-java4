/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import Interface.IUser;
import entities.Recette;
import entities.User;
import entities.Vote;
import java.sql.Time;
import java.util.Scanner;
import service.RecetteService;
import service.UserService;
import service.VoteService;

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
      User u2 = new User("ABCDEFGH", "M.M@espt.tn", "55","	\n" +
"a:1:{i:0;s:11:\"ROLE_CLIENT\";}");
     //  UserService userService = new UserService(); cette ligne ou ligne eli ta7tha as i like 
      IUser userService = new UserService();
      
     userService.add(u2); 
       /******* update user *********/
  /*   User u3= new User();
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
 //  UserService userService = new UserService(); 
 //  userService.getAll();
  //System.out.println(userService.getAll()); 
   /******* user remove **************/
  // userService.remove(13);
  
  /*************  user find by id **********************/
 // System.out.println(userService.findById(12)); 
 
  /************* find by login(if user exist or no) return true /false **********************/
 // System.out.println(userService.findByLogin("marwa")); 
  
  /************* find by login return user  **********************/
 // System.out.println(userService.UserByLogin("marwa")); 
  
  /************* find by password(if password exist or no) return true /false **********************/
  //System.out.println(userService.findByPassword("5567685")); 
  
  /************* get role  **********************/
 // System.out.println(userService.Getrole("marwa"));  
 
  /*  RecetteService RS = new RecetteService();
        Recette R1 = new Recette();
       Scanner scanner = new Scanner( System.in);
       User X = new User();
         System.out.println("id user");
       X.setId(scanner.nextInt());
        R1.setIduser(X);
        System.out.println("enter nom");
        R1.setNom(scanner.next());
        System.out.println("enter type");
        R1.setType(scanner.next());
        System.out.println("enter Description");
        R1.setDescription(scanner.next());
        System.out.println("enter nom image");
        R1.setNom_image(scanner.next());
        System.out.println("enter cout");
        R1.setCout(scanner.next());
      String preparation="";
        System.out.println("enter temps de preparation ");
       preparation=scanner.next();
      R1.setTemps_preparation(Time.valueOf(preparation) );//sous forme 00:00:00
    
        String repos="";
        System.out.println("enter temps de repos ");
        repos=scanner.next();
        R1.setTemps_repos(Time.valueOf(repos) );
        String cuisson="";
        System.out.println("enter temps de cuisson ");
        cuisson=scanner.next();
        R1.setTemps_cuisson(Time.valueOf(cuisson) );
        
 
        System.out.println("enter difficulte");
        R1.setDifficulte(scanner.next());     
        System.out.println("enter nombre de personne");
        R1.setNb_personne(scanner.nextInt());
        System.out.println("enter astuces");
        R1.setAstuces(scanner.next());
        System.out.println("enter ingrédients");
        R1.setIngredients(scanner.next());
        System.out.println("enter etapes");
        R1.setEtapes(scanner.next());
        RS.add(R1); */
  Vote a = new Vote();
  VoteService VS = new VoteService();
  double abc= VS.noteRecette(2);
  /*int vv= VS.TOP1();
  int v2= VS.TOP2();
  int v3= VS.TOP3();
  int v4= VS.TOP4(); */
  int v5= VS.TOP5();
  
        
        

       
    }
}
