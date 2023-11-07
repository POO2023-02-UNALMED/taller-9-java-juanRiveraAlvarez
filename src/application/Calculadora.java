package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application  {
	
	public static void main(String args[]){ 
	      launch(args); 
	} 
	
	@Override
	public void start(Stage window) throws Exception {
		
		//Button b7 = new Button("7");
		VBox vb = new VBox();
		window.setTitle("Calculadora");
		
		vb.getChildren().add(new Calculator());
		Scene sc = new Scene(vb, 270, 270);
		window.setScene(sc);
		window.show();
	}
	
}
