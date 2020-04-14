package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage berkan) throws Exception {
		Parent root=FXMLLoader.load(getClass().getResource("sahne.fxml"));
		Scene scene=new Scene(root,620,620);
		berkan.setScene(scene);
         berkan.show();		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
