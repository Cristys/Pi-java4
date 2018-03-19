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
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Siala
 */
public class InterfaceAdminController implements Initializable {

    @FXML
    private AnchorPane anco;
    @FXML
    private VBox ChangeItGirls;
    @FXML
    private SplitPane Panel;
    @FXML
    private ImageView CHomePage;
    @FXML
    private VBox CAdminpannelHome;
    @FXML
    private VBox CBoxClients;
    @FXML
    private Text Cclients;
    @FXML
    private VBox CBoxRecettes;
    @FXML
    private Text Crecettes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
