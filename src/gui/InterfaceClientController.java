/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import utils.Session;


/**
 * FXML Controller class
 *
 * @author Siala
 */
public class InterfaceClientController implements Initializable {

    @FXML
    private AnchorPane anco;
    @FXML
    private ImageView home;
    @FXML
    private Button recette;
    @FXML
    private Button patisserie;
    @FXML
    private Button shop;
    @FXML
    private Button promo;
    @FXML
    private Button eval;
    @FXML
    private Button reclamation;
    @FXML
    private ImageView panier;
    @FXML
    private ImageView profil;
    @FXML
    private ImageView logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          
    }    

    @FXML
    private void goToRecettes(MouseEvent event) {
    }

    @FXML
    private void goToClientProfil(MouseEvent event) {
    }

    @FXML
    private void logoutClient(MouseEvent event) {
    }
    
}
