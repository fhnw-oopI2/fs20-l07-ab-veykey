package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox{

	private Slider slider;
	private TextField txtField;

	public ApplicationUI() {
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {
		slider = new Slider();
		txtField = new TextField();
		
		txtField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
	}

	private void layoutControls() {
		setSpacing(10);
		setPadding(new Insets(10));
		setAlignment(Pos.CENTER);
		getChildren().addAll(txtField, slider);
	
		
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setBlockIncrement(0.5f);
		slider.setSnapToTicks(true);

	}

}
