package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {

	private Slider slider;
	private Label label;

	public ApplicationUI() {
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {
		slider = new Slider();
		label = new Label();
		slider.valueProperty().addListener((observable, oldValue, newValue) -> label.setText(newValue.toString()));

	}

	private void layoutControls() {
		setSpacing(10);
		setPadding(new Insets(10));
		setAlignment(Pos.CENTER);
		getChildren().addAll(label, slider);

		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setBlockIncrement(0.5f);
		slider.setSnapToTicks(true);

	}

}
