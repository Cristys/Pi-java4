/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Siala
 */
public class InterfaceAdmin_ClientsController implements Initializable {

    @FXML
    private AnchorPane anco;
    @FXML
    private SplitPane Panel;
    @FXML
    private ImageView CHomePage;
    @FXML
    private VBox CBoxAdminHome;
    @FXML
    private VBox CBoxClients;
    @FXML
    private Text Cclients;
    @FXML
    private VBox CBoxProuits;
    @FXML
    private VBox CBoxRecettes;
    @FXML
    private Text Crecettes;
    @FXML
    private VBox CBoxPrmotion;
    @FXML
    private VBox CBoxReclamation;
    @FXML
    private VBox CBoxEvaluation;
    @FXML
    private VBox CBoxPanier;
    @FXML
    private VBox ChangeItGirls;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToHome(MouseEvent event) throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceAdmin.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }
    

    @FXML
    private void goToClients(MouseEvent event)  throws SQLException, IOException  {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceAdmin_Clients.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void goToResponsables(MouseEvent event) throws SQLException, IOException  {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceAdmin_Responsables.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void goToProduits(MouseEvent event)  throws SQLException, IOException  {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceAdmin_Produits.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void goToRecettes(MouseEvent event)  throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceAdmin_Recettes.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void goToPromotion(MouseEvent event) throws SQLException, IOException  {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceAdmin_Promotion.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void goToReclamation(MouseEvent event)  throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceAdmin_Reclamation.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void goToEvaluation(MouseEvent event)  throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceAdmin_Evaluation.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void goToPanier(MouseEvent event) throws SQLException, IOException  {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceAdmin_Panier.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void LogOut(MouseEvent event) throws SQLException, IOException {
     FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceLogin.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }
    
}
