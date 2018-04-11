/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static com.oracle.jrockit.jfr.Transition.To;
import entities.AudioPlayerExample1;
import entities.MailMarwa;
import entities.Recette;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import service.RecetteService;
import utils.Session;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 * FXML Controller class
 *
 * @author Siala
 */
public class InterfaceClientProfile_AjoutRecetteController implements Initializable {

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
    private TextField nom;
    @FXML
    private ComboBox<String> type;
    @FXML
    private TextArea description;
    @FXML
    private Button AddImage;
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
     @FXML
    private Button CAjouterButton;
    @FXML
    private Label LabelAlert;
    
    RecetteService Rs = new RecetteService();
    Recette r = new Recette();

    /**
     * Initializes the controller class.
     */
    // init des comboBox
    ObservableList<String> types = FXCollections.observableArrayList("Biscuits","Chocolat","Gateux et Entremets","Cremes et Confitures","Tartes","Spécialités Tunisiennes","Traiteur(salé)","Pains et Viennoiseries","Recettes de base","Diététiques");
    ObservableList<String> couts = FXCollections.observableArrayList("Pas cher","Adorable","assez cher");   
    ObservableList<String> difficultes = FXCollections.observableArrayList("Facile","Medium","Difficile");
    @FXML
    private Label LabelAlertPersonne;
    @FXML
    private Label LabelAlertTemp;
    @FXML
    private Text username;
    @FXML
    private Label LabelImg;
    @FXML
    private ImageView btnClose;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // init des comboBox avec les listes déclarés en haut
        type.setItems(types);
        cout.setItems(couts);
        difficulte.setItems(difficultes);
        
        username.setText(Session.LoggedUser.getUsername());
        
        LabelAlert.setText("");
        LabelImg.setText("test");
        ////////////////////
        
	String audioFilePath = "C:/Users/Siala/Music/Beep17.wav";
        AudioPlayerExample1 player = new AudioPlayerExample1();
        player.play(audioFilePath);
        //////////////////////
    }    

  @FXML
    private void GoToHome(MouseEvent event) throws SQLException, IOException{
         
                FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceClient.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void GoToClientProfile(MouseEvent event) throws SQLException, IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceClientProfile.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void GoToRecettes(MouseEvent event) throws SQLException, IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceRecettes.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void GoToPatisseries(MouseEvent event)throws SQLException, IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfacePatisseries.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void GoToShop(MouseEvent event)throws SQLException, IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceShop.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void GoToPromo(MouseEvent event) throws SQLException, IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfacePromo.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void GoToReclamation(MouseEvent event) throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceReclamation.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void GoToEvaluation(MouseEvent event) throws SQLException, IOException{
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceEvaluation.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void GoToPanier(MouseEvent event) throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfacePanier.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void LogOut(MouseEvent event) throws SQLException, IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceLogin.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }
    // verifier si le text est vide
   private boolean valide(String s){
      boolean v =true ;
       if ( "".equals(s))
        v= false ;
      return v ; 
    }
   
   //vérifier que la forme du temps est correcte  de 00:00:00 a 23:59:59
    private boolean valideTime(String time){
       boolean v =false ;
       //1 doit etre un string egale a 8
       if(time.length()==8){
           // on prend les 3 parties avec split// on test si les heures entre 00 et 23 et les min/secondes entre 0 et 59
            if(time.indexOf(':')!=-1){
                String filename = time;     // full file name
                String[] parts = filename.split(":");
                String HH=parts[0];
                int foo = Integer.parseInt(HH);
                if(foo>=0 && foo<=23) {
                    String time2=time;
                    time2 = time2.substring(time2.indexOf(":") + 1); 
                    if(time2.indexOf(':')!=-1){
                        String filename2 = time2;     // full file name
                        String[] parts2 = filename2.split(":");
                        String mm=parts2[0];
                        int foo2 = Integer.parseInt(mm);
                        if(foo2>=0 && foo2<=60) {
                           String time3=time2;
                           time3 = time3.substring(time3.indexOf(":") + 1); 
                           int foo3 = Integer.parseInt(time3);
                            if(foo3>=0 && foo3<=60) {
                               v=true;
                            }
                        }
                    }  
                }
            }
        }
        return v ; 
    } 
    
    //vérifier que le nombre de personne soit sup a zero
    private boolean validePersonne(String a){
        boolean v =false ;
        try {
           Integer.parseInt(a);
           if (Integer.parseInt(a) >0){
               v=true;
            }
        } catch (NumberFormatException e) {
            v=false;
            System.out.println("Wrong number");
        }
         return v ; 
    }
     
    @FXML
    private void AjouterRecette(MouseEvent event) throws MalformedURLException , SQLException, IOException{
       //init des labels alert vides
       LabelAlert.setText("");
       LabelAlertPersonne.setText("");
       LabelAlertTemp.setText("");
       
       Recette R1 = new Recette();
       int test=0;
       R1.setIduser(Session.LoggedUser); 
   
       if(valide(nom.getText())){
          R1.setNom(nom.getText());
        }else{
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
                 
        if(type.getValue()!= null){
           R1.setType(type.getValue());
        }else {
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
         
        if(valide(description.getText())){
           R1.setDescription(description.getText());
        }else {
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
         
        if(validePersonne(nbPersonne.getText())){
           R1.setNb_personne(Integer.valueOf(nbPersonne.getText()));
        }else {
            test++; 
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
         
        if(cout.getValue()!= null){
           R1.setCout(cout.getValue());
        }else {
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        } 
         
        if(difficulte.getValue()!=null){
           R1.setDifficulte(difficulte.getValue());
        }else {
            test++; 
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
        
        if(valide(Tpreparation.getText())){
           R1.setTemps_preparation(Time.valueOf(Tpreparation.getText()));
        }else {
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
             
        if(valide(Trepos.getText())){
           R1.setTemps_repos(Time.valueOf(Trepos.getText()));
        }else {
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
           
        if(valide(Tcuisson.getText())){
           R1.setTemps_cuisson(Time.valueOf(Tcuisson.getText()));
        }else {
            test++; 
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
          
        if(valide(ingredients.getText())){
           R1.setIngredients(ingredients.getText());
        }else {
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
           
        if(valide(astuces.getText())){
           R1.setAstuces(astuces.getText());
        }else {
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
           
        if(valide(etapes.getText())){
           R1.setEtapes(etapes.getText());
        }else {
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
       
        if(valide(r.getNom_image())) {
           R1.setNom_image(r.getNom_image());}
        else {
            test++;
            LabelAlert.setText("Veuillez Remplir Tout les champs !");
        }
        // test==0 les champs ne sont pas vides
        // alert vides: image ajoutée, cout,difficulté et type selectionnée
        if(test==0 && "".equals(LabelAlertPersonne.getText()) && "".equals(LabelAlertTemp.getText()) && "".equals(LabelImg.getText()) )
        {   //demander la confirmation de l'ajout
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("Confirmer l'ajout de cette Recette! Merci");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) { 
                //////////////////////1 add to database
                System.out.println("equals");
                Rs.add(R1); 
                ///////////////////// 2 get it in Document word
                //////////////////// /3 Send mail
                MailMarwa ma = new MailMarwa();
                String[] attachFiles = new String[1];
                attachFiles[0] = getItDOC(); //getItDOC fonction en bas pour mettre les données de cette recette dans un pdf
                try {
                    ma.sendEmailWithAttachments(Session.LoggedUser.getEmail(),
                        "marwa.siala2017@gmail.com",
                        "recette ajoutée",
                        "Vous trouvez ci joint la recette que vous avez ajouté. \n Merci pour votre contribution!",
                        attachFiles);
                    System.out.println("Email sent.");
                } catch (Exception ex) {
                    System.out.println("Could not send email.");
                    ex.printStackTrace();
                }
                /////////////////// fin mail
                //////////////////  4 success sound
                 String audioFilePath = "C:/Users/Siala/Music/yay.wav";
                 AudioPlayerExample1 player = new AudioPlayerExample1();
                 player.play(audioFilePath);
                ///// end sound
                ///////////////// 5 direction page: mes recettes
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceClientProfile_MesRecett.fxml"));
                Parent root = loader.load();
                ChangeItGirls.getScene().setRoot(root); 
            }    
        } 
        else{
            // donnée worng ou null => pas d'action d'ajout
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("");
            alert.setHeaderText("Veuillez Remplir tous les champs afin d'ajouter votre recettte");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) { 
                System.out.println("ok");
            }
       } 
 
    }

    @FXML
    private void addImage(MouseEvent event) throws MalformedURLException, SQLException {
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        if (selectedFile != null) {
            String imageFile = selectedFile.toURI().toURL().toString();
            System.out.println(imageFile);
            r.setNom_image(imageFile);
            LabelImg.setText("");
        } else {
           LabelAlert.setText("image n'existe pas");
           LabelImg.setText("x");
        } 
    }

    @FXML
    private void ControlNom(MouseEvent event) {
    // n'est pas utilisé ici 
    }

    @FXML
    private void ControlNbPersonne(MouseEvent event) {
        //affiche un text d'alert si le nb personne est faux
        if(validePersonne(nbPersonne.getText())){
            LabelAlertPersonne.setText("");
        }else {
            LabelAlertPersonne.setText("Nombre Personne doit etre sup à 0");
        }
    }

  

    @FXML
    private void ControlTimeP(MouseEvent event) {
        // affiche un text d'alert si le temp format est fausse
        if(valideTime(Tpreparation.getText())){
            LabelAlertTemp.setText("");   
        }else {
            LabelAlertTemp.setText("Temps doit etre sous la forme 00:00:00");
        }
    }

    @FXML
    private void ControlTimeR(MouseEvent event) {
        // affiche un text d'alert si le temp format est fausse
        if(valideTime(Trepos.getText())){
            LabelAlertTemp.setText("");   
        }else {
            LabelAlertTemp.setText("Temps doit etre sous la forme 00:00:00");
        }
    }

    @FXML
    private void ControlTimeC(MouseEvent event) {
        // affiche un text d'alert si le temp format est fausse
        if(valideTime(Tcuisson.getText())){
            LabelAlertTemp.setText("");   
        }else {
            LabelAlertTemp.setText("Temps doit etre sous la forme 00:00:00");
        }
    }

    @FXML
    private void MouseClickClose(MouseEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
    // passer la recette dans un document word 
     public String getItDOC() throws FileNotFoundException, IOException{
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph tmpParagraph = document.createParagraph();
        XWPFRun tmpRun = tmpParagraph.createRun();
        //////////////
     
        String LeText= "Nom: "+nom.getText()+
                "\n Proposée par: "+username.getText()+
                "\n Type: "+type.getValue()+
                "\n Description: "+description.getText()+
                "\n Nombre de Personne: "+nbPersonne.getText()+
                "\n Cout: "+ cout.getValue()+
                "\n Difficulté:"+difficulte.getValue()+
                "\n Temps de Préparation: "+Tpreparation.getText()+
                "\n Temps de Préparation:"+Trepos.getText()+
                "\n Temps de Cuisson: "+Tcuisson.getText()+
                "\n Ingrédients: "+ ingredients.getText()+
                "\n Etapes: "+etapes.getText()+
                "\n Astuce: "+astuces.getText();
        for (String str : LeText.split("\n")) {
            tmpRun.setText(str);
            tmpRun.addBreak();
            tmpRun.setColor("9966ff"); 
        }
        tmpRun.setFontSize(18);
        
        document.write(new FileOutputStream(new File("C:/wamp64/www/java_DOC/ms"+String.valueOf(Session.LoggedUser.getId())+"_"+nom.getText()+".docx")));
        return "C:/wamp64/www/java_DOC/ms"+String.valueOf(Session.LoggedUser.getId())+"_"+nom.getText()+".docx";
    }
    
}
