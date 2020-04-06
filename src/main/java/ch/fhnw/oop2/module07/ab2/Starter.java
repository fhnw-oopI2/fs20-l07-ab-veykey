package ch.fhnw.oop2.module07.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	@Override
	public void start(Stage primaryStage) {
		Parent rootPanel = new ApplicationUI();
		Scene scene = new Scene(rootPanel);
		
		primaryStage.setTitle("Arbeitsblatt 2");
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(150);
		primaryStage.show();

	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}