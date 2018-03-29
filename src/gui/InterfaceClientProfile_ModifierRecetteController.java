/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Recette;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import service.RecetteService;
import utils.Session;

/**
 * FXML Controller class
 *
 * @author Siala
 */
public class InterfaceClientProfile_ModifierRecetteController implements Initializable {

    @FXML
    private AnchorPane anco;
    @FXML
    private VBox ChangeItGirls;
    @FXML
    private Text username;
    @FXML
    private TextField nom;
    @FXML
    private ComboBox<String> type;
    @FXML
    private TextArea description;
    @FXML
    private Button AddImage;
 //   private Label LabelAlertPersonne;
    @FXML
    private TextField nbPersonne;
    @FXML
    private ComboBox<String> difficulte;
    @FXML
    private ComboBox<String> cout;
    @FXML
    private TextField Tpreparation;
    @FXML
    private TextField Trepos;
    @FXML
    private TextField Tcuisson;
    @FXML
    private TextArea ingredients;
    @FXML
    private TextArea astuces;
    @FXML
    private TextArea etapes;
    //private Label LabelAlert;
  //  private Label LabelAlertTemp;
    @FXML
    private ImageView close;
    @FXML
    private Button CModifierButton;

       RecetteService Rs = new RecetteService();
    Recette r= new Recette();

    /**
     * Initializes the controller class.
     */
    ObservableList<String> types = FXCollections.observableArrayList("Biscuits","Chocolat","Gateux et Entremets","Cremes et Confitures","Tartes","Spécialités Tunisiennes","Traiteur(salé)","Pains et Viennoiseries","Recettes de base","Diététiques");
    ObservableList<String> couts = FXCollections.observableArrayList("Pas cher","Adorable","assez cher");   
    ObservableList<String> difficultes = FXCollections.observableArrayList("Facile","Medium","Difficile");
    @FXML
    private Text emptyimageName;
    @FXML
    private Text emptyIdRecette;
   
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         type.setItems(types);
         cout.setItems(couts);
         difficulte.setItems(difficultes);
         username.setText(Session.LoggedUser.getUsername());
        
    }    

     
    @FXML
    private void ModifierRecette(MouseEvent event) throws MalformedURLException , SQLException, IOException{
     //  LabelAlert.setText("");
     //  LabelAlertPersonne.setText("");
     //  LabelAlertTemp.setText("");
       RecetteService Rs1 = new RecetteService();
       Recette R1 =  new Recette();
       
      R1.setIduser(Session.LoggedUser); 
      R1.setId(Integer.valueOf(emptyIdRecette.getText()));
        
        R1.setNom(nom.getText());
       
        R1.setType(type.getValue());
       
        R1.setDescription(description.getText());
        
        R1.setNb_personne(Integer.valueOf(nbPersonne.getText()));
        
        R1.setCout(cout.getValue());
         
        R1.setDifficulte(difficulte.getValue());
         
        R1.setTemps_preparation(Time.valueOf(Tpreparation.getText()));
      
        R1.setTemps_repos(Time.valueOf(Trepos.getText()));
       
        R1.setTemps_cuisson(Time.valueOf(Tcuisson.getText()));
        
        R1.setIngredients(ingredients.getText());
      
        R1.setAstuces(astuces.getText());
         
        R1.setEtapes(etapes.getText());
        
       R1.setNom_image(emptyimageName.getText());
         
            
            Rs1.update(R1); 
            System.out.println("success");
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Recette Modifiée ");
            alert.setHeaderText(null);
           
      
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
           
                
               Stage stage = (Stage)
              close.getScene().getWindow();
    // do what you have to do
    stage.close();
           
        }
           
      
    }

    @FXML
    private void addImage(MouseEvent event) throws MalformedURLException, SQLException {
             FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        if (selectedFile != null) {
         
            String imageFile = selectedFile.toURI().toURL().toString();
            System.out.println(imageFile);
            
           emptyimageName.setText( imageFile);
          

        } else {
             Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("file doesn't exist ");
            alert.setHeaderText(null);
           
      
            Optional<ButtonType> result = alert.showAndWait();
           //LabelAlert.setText("file doesn't exist");
        } 
      
    }

    @FXML
    private void clickClose(MouseEvent event) {
          Stage stage = (Stage) close.getScene().getWindow();
    // do what you have to do
    stage.close();
    }

    @FXML
    private void ControlNom(MouseEvent event) {
    }

    @FXML
    private void ControlNbPersonne(MouseEvent event) {
    }

    @FXML
    private void ControlTimeP(MouseEvent event) {
    }

    @FXML
    private void ControlTimeR(MouseEvent event) {
    }

    @FXML
    private void ControlTimeC(MouseEvent event) {
    }
    
        
     void initData(Recette r) {
              
                nom.setText(r.getNom());
                username.setText(r.getIduser().getUsername());
                type.setValue(r.getType());
                description.setText(r.getDescription());
                nbPersonne.setText(String.valueOf(r.getNb_personne()));
                cout.setValue(r.getCout());
                difficulte.setValue(r.getDifficulte());
                Tpreparation.setText(String.valueOf(r.getTemps_preparation()));
                Trepos.setText(String.valueOf(r.getTemps_repos()));
                Tcuisson.setText(String.valueOf(r.getTemps_cuisson()));
                ingredients.setText(r.getIngredients());
                etapes.setText(r.getEtapes());
                astuces.setText(r.getAstuces());
              //  String ImageFile=r.getNom_image();
              emptyimageName.setText(r.getNom_image());
              emptyIdRecette.setText(String.valueOf(r.getId()));
              
                
     }


}