package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ApplicationUI extends FlowPane {

	private Button button;
	int index = 1;

	public ApplicationUI() {
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {
		button = new Button("Add Label");
		button.setOnAction(event -> {
			getChildren().add(new Label("Label" + index++));
		});
	}

	private void layoutControls() {

		getChildren().add(button);
		setPadding(new Insets(10));
		setVgap(10);
		setHgap(10);

	}

}
