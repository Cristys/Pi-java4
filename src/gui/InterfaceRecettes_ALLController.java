/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Recette;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import utils.Session;

/**
 * FXML Controller class
 *
 * @author Siala
 */
public class InterfaceRecettes_ALLController implements Initializable {

    @FXML
    private AnchorPane anco;
    @FXML
    private ImageView CHome;
    @FXML
    private ImageView CclientIcon;
    @FXML
    private ImageView CrecetteIcon;
    @FXML
    private ImageView CPatisserieIcon;
    @FXML
    private ImageView CShopIcon;
    @FXML
    private ImageView CPromoIcon;
    @FXML
    private ImageView CReclamationIcon;
    @FXML
    private ImageView CEvaluationIcon;
    @FXML
    private ImageView CPanierIcon;
    @FXML
    private ImageView CLogoutIcon;
    @FXML
    private VBox CBoxHome;
    @FXML
    private ImageView CHomeIcon;
    @FXML
    private Text LabelHome;
    @FXML
    private VBox CBoxClient;
    @FXML
    private Text LabelClient;
    @FXML
    private VBox CBoxRecette;
    @FXML
    private Text LabelRecette;
    @FXML
    private VBox CBoxPatisserie;
    @FXML
    private VBox CBoxShop;
    @FXML
    private VBox CBoxPromo;
    @FXML
    private VBox CBoxReclamation;
    @FXML
    private VBox CBoxEvaluation;
    @FXML
    private VBox CBoxPanier;
    @FXML
    private VBox ChangeItGirls;
    @FXML
    private ImageView btnClose;
    @FXML
    private TableView<Recette> TableRecette;
    @FXML
    private TableColumn<Recette, String> image;
    @FXML
    private TableColumn<Recette, String> nom;
    @FXML
    private TableColumn<Recette, String> username;
    @FXML
    private TableColumn<Recette, String> type;
    @FXML
    private TableColumn<Recette, String> difficulte;
    @FXML
    private TableColumn<Recette, String> cout;
    @FXML
    private TableColumn<Recette, String> note;
ObservableList<Recette> Liste_Recettes = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         Liste_Recettes = FXCollections.observableArrayList(Session.iRecetteService.getByUser(Session.LoggedUser.getId()));
        TableRecette.setItems(Liste_Recettes);
       
      
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colNom.cellFactoryProperty();
    }    

    @FXML
    private void GoToHome(MouseEvent event) {
    }

    @FXML
    private void GoToClientProfile(MouseEvent event) {
    }

    @FXML
    private void GoToRecettes(MouseEvent event) {
    }

    @FXML
    private void GoToPatisseries(MouseEvent event) {
    }

    @FXML
    private void GoToShop(MouseEvent event) {
    }

    @FXML
    private void GoToPromo(MouseEvent event) {
    }

    @FXML
    private void GoToReclamation(MouseEvent event) {
    }

    @FXML
    private void GoToEvaluation(MouseEvent event) {
    }

    @FXML
    private void GoToPanier(MouseEvent event) {
    }

    @FXML
    private void LogOut(MouseEvent event) {
    }

    @FXML
    private void onMouseClickClose(MouseEvent event) {
    }

    @FXML
    private void ConsulterDetails(MouseEvent event) {
    }

    @FXML
    private void ConsulterRecette(MouseEvent event) {
    }

    
}
