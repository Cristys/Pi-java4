/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Commentaire;
import entities.Recette;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import service.CommentaireService;
import service.RecetteService;
import utils.Session;

/**
 * FXML Controller class
 *
 * @author Siala
 */
public class InterfaceCommenterController implements Initializable {

    @FXML
    private TextArea commentArea;
    @FXML
    private Pane btnComment;
    @FXML
    private ImageView btnClose;
    @FXML
    private Text idrecette;
    @FXML
    private AnchorPane anco;
    RecetteService Rec = new RecetteService();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
           }    
    void initData(Recette r){
         idrecette.setText(String.valueOf(r.getId()));
    }
     private boolean valide(String s){
    boolean v =true ;
    if ( s.equals(""))
        v= false ;
    return v ; 
   }
    @FXML
    private Stage commentadd(MouseEvent event) throws IOException {
           CommentaireService Cm = new CommentaireService();
        Commentaire C1 = new Commentaire();
        C1.setIdrecette(Session.iRecetteService.findById(Integer.valueOf(idrecette.getText())));
         C1.setIduser(Session.LoggedUser); 
      FXMLLoader loader1 = new FXMLLoader(getClass().getResource("InterfaceRecettes_AfficherUneR.fxml"));
       Stage stage1 = new Stage(StageStyle.TRANSPARENT);
       if(valide(commentArea.getText())){
        C1.setComment(commentArea.getText());
        Cm.add(C1);
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Le commentaire est bien ajoutée ");
            alert.setHeaderText("veuillez rafraichir la page pour voir votre comentaire");
              Optional<ButtonType> result = alert.showAndWait();
            Stage stage = (Stage) anco.getScene().getWindow();
            stage.close();
          
         // scene.setFill(javafx.scene.paint.Color.TRANSPARENT);
      
        stage1.setScene(new Scene((Pane) loader1.load())); 
         
      InterfaceRecettes_AfficherUneR_1Controller controller = 
        loader1.<InterfaceRecettes_AfficherUneR_1Controller>getController();
        controller.initData(Rec.findById(Integer.valueOf(idrecette.getText())));
   
 
        
         }else{
              Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Attention!");
            alert.setHeaderText("Le commentaire ne doit pas etre vide ");
              Optional<ButtonType> result = alert.showAndWait();
    }
      stage1.show();

        return stage1;  
    }

    @FXML
    private void onClickClose(MouseEvent event) {
         Stage stage = (Stage) btnClose.getScene().getWindow();
    // do what you have to do
    stage.close();
    }
}
