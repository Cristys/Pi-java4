/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.jfoenix.controls.JFXTextField;
import com.nexmo.client.NexmoClient;
import com.nexmo.client.NexmoClientException;
import com.nexmo.client.auth.AuthMethod;
import com.nexmo.client.auth.TokenAuthMethod;
import com.nexmo.client.sms.SmsSubmissionResult;
import com.nexmo.client.sms.messages.TextMessage;
import javafx.scene.control.Button;
import static jdk.nashorn.internal.runtime.JSType.TO_NUMBER;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import entities.AudioPlayerExample1;
import java.io.File;
import java.util.Optional;
import java.util.Random;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;


/**
 * FXML Controller class
 *
 * @author Siala
 */

public class InterfaceRecettesController implements Initializable {

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
    private VBox TopRecettes;
    @FXML
    private VBox AllRecettes;
    @FXML
    private HBox newsLetter;
    @FXML
    private Pane PaneSMS;
    @FXML
    private JFXTextField NumberSMS;
    @FXML
    private ImageView btnCloseSMS;

    /**
     * Initializes the controller class.
     */
    public static final String API_KEY =  "1ecc5615" ;
    public static final String API_SECRET = "P6davZ1wljxoE1U0";
    @FXML
    private Button btnForSMS;

    
  /*  curl -X POST  https://rest.nexmo.com/sms/json \ 
     -d api_key=1ecc5615 \
     -d api_secret=P6davZ1wljxoE1U0 \
     -d to=21654821045 \
     -d from="NEXMO" \
     -d text="Hello from Nexmo" 
  */
   // AuthMethod auth = new TokenAuthMethod(API_KEY, API_SECRET);
   //   NexmoClient client = new NexmoClient(auth);
   // System.out.println(FROM_NUMBER);

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        PaneSMS.setVisible(false);
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

    @FXML
    private void onMouseClickClose(MouseEvent event) {
            Stage stage = (Stage) btnClose.getScene().getWindow();
    // do what you have to do
    stage.close();
    }

    @FXML
    private void mouseClickTopRecettes(MouseEvent event) throws IOException {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceRecettes_TOP5.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }

    @FXML
    private void MouseClickGoToAllRecettes(MouseEvent event) throws IOException {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfaceRecettes_ALL.fxml"));
                
                Parent root = loader.load();
                
                anco.getScene().setRoot(root);
    }
     //sms not newsletter maintenant
    @FXML
    private void MouseClickGoToNewsLetter(MouseEvent event) {
        PaneSMS.setVisible(true);
    }

  /*  private void SendSMS(MouseEvent event)throws SQLException, IOException, NexmoClientException {
       
        
    } */

    @FXML
    private void CloseSMS(MouseEvent event) {
        PaneSMS.setVisible(false);
    }
  
   // System.out.println("+21654821045");
    // pour tester que le nombre tél entrée est correcte
   private boolean valide(String num){
       boolean b=true;
       if("".equals(num)){
           b=false;
        } else{
           int x = Integer.valueOf(num);
           if(x>20000000 && x<99999999){
               b=true;
           }else{
               b=false;
           }
        }
        return b;   
   }
  
    @FXML
    private void sendSMS1(MouseEvent event) throws SQLException, IOException, NexmoClientException{
        // 1 mettre un tableau string avec les astuces et choisir avec random
        String numberSMS="+216" +  NumberSMS.getText();
        String[] Astuce = {"Oeufs cuits durs dans le four? Placez-les dans une plaque a muffins puis mettre au four 25 a 30 minutes a 325˚F",
                           "Petit truc tout simple : équeuter vos fraises en les perçant de part en part à l'aide d'une paille.",
                           "BonBons de fraises : faire sécher des morceaux de fraises au four, sur une plaque, pendant 3 heures a 200°F",
                           "Un citron chauffe au four ou micro-ondes pendant 15 secondes donnera ensuite deux fois plus de jus.",
                           "vous n'avez que du beurre congele? Solution: raper le beurre, le mesurer au besoin,et l'ajouter tel quel dans la recette.",
                           "versez la creme pour le chantilly dans un cul de poule et placez-la avec le fouet du batteur au congelateur pendant 20 min"};
        String random = (Astuce[new Random().nextInt(Astuce.length)]);
        //2 verifier si le num est valide
        if(valide(NumberSMS.getText())==true){
            //3 mettre le key pour s'authentifier au service
        AuthMethod auth = new TokenAuthMethod("1ecc5615", "P6davZ1wljxoE1U0");
        NexmoClient client = new NexmoClient(auth);
        //4 mettre les données de l'sms
        SmsSubmissionResult[] responses = client.getSmsClient().submitMessage(new TextMessage(
        "Cupcakes ",
        numberSMS,
        random));
        for (SmsSubmissionResult response : responses) {
            System.out.println(response);
        }}
        else{
             Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("");
            alert.setHeaderText("Forme erroné du numéro! veuillez re-entrer votre numéro");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) { 
                System.out.println("ok");
            }
        }
    }
}

