package nbaBDD;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	
	
	
	
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane panel = new Pane();
		panel.resize(100, 200);
		
		
		Scene sc = new Scene(panel);
		
		primaryStage.setScene(sc);
		
		primaryStage.show();
		
	}

	
	
	
	public static void main(String[] args) {
		
		
		launch(args);
		
		
		
		
		
	}
}
