package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller implements Initializable{
    @FXML
    private TextField txtad;

    @FXML
    private TextField txtsoyad;

    @FXML
    private TextField txttelno;

    @FXML
    private TextArea txtadres;

    @FXML
    private ChoiceBox<String> choisedg;

    @FXML
    private ChoiceBox<String> choiseay;

    @FXML
    private ChoiceBox<String> choisesyýl;

    @FXML
    private ComboBox<String> comboders;

    @FXML
    private ComboBox<String> combohayvan;

    @FXML
    private ComboBox<String> comborakam;

    @FXML
    private ComboBox<String> comboyoutuber;
    @FXML
    private ComboBox<String> combomeyve;
    

    @FXML
    private Label labelsonuc;
    @FXML
    private Label labelderece;

    @FXML
    private RadioButton radio5;

    @FXML
    private ToggleGroup derece;

    @FXML
    private RadioButton radio4;

    @FXML
    private RadioButton radio3;

    @FXML
    private RadioButton radio2;
    
    String anayazi="";
    @FXML
  public  void kaydetdogumtarýh(ActionEvent event) {

     anayazi+="\n"+choisedg.getSelectionModel().getSelectedItem()+"-"+choiseay.getSelectionModel().getSelectedItem()+"-"+choisesyýl.getSelectionModel().getSelectedItem();
    }

    @FXML
  public  void kaydetfavorý(ActionEvent event) {
      anayazi+="\n"+comboders.getSelectionModel().getSelectedItem()+"\n"+combohayvan.getSelectionModel().getSelectedItem();
      anayazi+="\n"+combomeyve.getSelectionModel().getSelectedItem()+"\n"+comborakam.getSelectionModel().getSelectedItem()+"\n"+comboyoutuber.getSelectionModel().getSelectedItem();
    }

    @FXML
    public   void kaydetkisisel(ActionEvent event) {
        anayazi+=txtad.getText()+txtsoyad.getText();
    }
    @FXML
    public  void sonucyz(ActionEvent event) {
    	labelsonuc.setText(anayazi);
    }
    @FXML
    void derecelendir(ActionEvent event) {
     if(derece.getSelectedToggle().equals(this.radio2))
     {
        labelderece.setText("vermis oldugunuz derece 2");
     }
     if(derece.getSelectedToggle().equals(this.radio3))
     {
    	  labelderece.setText("vermis oldugunuz derece 3");
     }
     if(derece.getSelectedToggle().equals(this.radio4))
     {
    	  labelderece.setText("vermis oldugunuz derece 4");
     }
     if(derece.getSelectedToggle().equals(this.radio5))
     {
    	  labelderece.setText("vermis oldugunuz derece 5");
     }
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		labelsonuc.setText(anayazi);
		choisedg.getItems().addAll("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31");
		choiseay.getItems().addAll("Ocak","Subat","Mart","Nýsan","Mayýs","Hazýran","Temmuz","Agustos","Eylul","Ekým","Kasým","Aralýk");
		choisesyýl.getItems().addAll("2000","1999","1998","1997","1996","1995","1994");
		comboders.getItems().addAll("java","php","mikro","aglar");
		combohayvan.getItems().addAll("kopek","kedi","kus");
		combomeyve.getItems().addAll("kýraz","erýk","kavun");
		comborakam.getItems().addAll("1","3","5","7");
		comboyoutuber.getItems().addAll("#beescp7","#beescp7","#beescp7");
	}

}
