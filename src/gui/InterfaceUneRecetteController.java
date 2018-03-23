/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Recette;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import utils.Session;

/**
 * FXML Controller class
 *
 * @author Siala
 */
public class InterfaceUneRecetteController implements Initializable {

    @FXML
    private AnchorPane anco;
    @FXML
    private Text username;
    @FXML
    private Text nom;
    @FXML
    private Text type;
    @FXML
    private Text description;
    @FXML
    private ImageView image;
    @FXML
    private Text nbPersonne;
    @FXML
    private Text cout;
    @FXML
    private Text difficulte;
    @FXML
    private Text Tpreparation;
    @FXML
    private Text Trepos;
    @FXML
    private Text Tcuisson;
    @FXML
    private Text ingredients;
    @FXML
    private Text etapes;
    @FXML
    private Text astuces;
    @FXML
    private ImageView close;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    private void GoToHome(MouseEvent event) throws SQLException, IOException{
         
                FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceClient.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    private void GoToClientProfile(MouseEvent event) throws SQLException, IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceClientProfile.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    private void GoToRecettes(MouseEvent event) throws SQLException, IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceRecettes.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    private void GoToPatisseries(MouseEvent event)throws SQLException, IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfacePatisseries.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    private void GoToShop(MouseEvent event)throws SQLException, IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceShop.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    private void GoToPromo(MouseEvent event) throws SQLException, IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfacePromo.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    private void GoToReclamation(MouseEvent event) throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceReclamation.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    private void GoToEvaluation(MouseEvent event) throws SQLException, IOException{
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceEvaluation.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    private void GoToPanier(MouseEvent event) throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfacePanier.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    private void LogOut(MouseEvent event) throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceLogin.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }
 // @FXML private Label customerName;
  void initialize() {}
  void initData(Recette r) {
    nom.setText(r.getNom());
    username.setText(r.getIduser().getUsername());
    type.setText(r.getType());
    description.setText(r.getDescription());
  nbPersonne.setText(String.valueOf(r.getNb_personne()));
  cout.setText(r.getCout());
  difficulte.setText(r.getDifficulte());
 Tpreparation.setText(String.valueOf(r.getTemps_preparation()));
 Trepos.setText(String.valueOf(r.getTemps_repos()));
 Tcuisson.setText(String.valueOf(r.getTemps_cuisson()));
 ingredients.setText(r.getIngredients());
 etapes.setText(r.getEtapes());
 astuces.setText(r.getAstuces());
  try{ 
         String imageFile = (Session.iRecetteService.findById(r.getId()).getNom_image());
        System.out.println(imageFile);
        Image image1 = new Image(imageFile);
        image.setImage(image1);}
     catch(Exception e){
          Image image2 = new Image("@../icons/mscupcake2.jpg");
        image.setImage(image2);
     }
    
  }

    @FXML
    private void clickClose(MouseEvent event) {
         Stage stage = (Stage) close.getScene().getWindow();
    // do what you have to do
    stage.close();
    }
}