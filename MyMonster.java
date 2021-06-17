//Jordan Ashe

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.Group;
import javafx.geometry.*;

class MyMonster extends Pane {
	String emote = "hello";
	int joy = 0;
	
	private void paint() {
		// Create a polygon and place polygon to pane
		Circle body = new Circle(200,100,80);
		body.setFill(Color.WHITE);
		body.setStroke(Color.BLACK);
		body.setStrokeWidth(5);
		
		Circle eye1 = new Circle(160,80,10);
		eye1.setFill(Color.WHITE);
		eye1.setStroke(Color.BLACK);
		eye1.setStrokeWidth(5);
		
		Circle eye2 = new Circle(240,80,10);
		eye2.setFill(Color.WHITE);
		eye2.setStroke(Color.BLACK);
		eye2.setStrokeWidth(5);
		
		Arc mouth = new Arc();
		mouth.setCenterX(200.0f);
		mouth.setCenterY(100.0f);
		mouth.setRadiusX(25.0f);
		mouth.setRadiusY(25.0f);
		mouth.setStartAngle(180.0f);
		mouth.setLength(180.0f);
		
		getChildren().clear();
		getChildren().add(body); 
		getChildren().add(eye1); 
		getChildren().add(eye2); 
		getChildren().add(mouth); 
	}
	
	public void setJoy(int j){
		this.joy = j;
		paint();
	}
	
	public void setEmote(String e){
		this.emote = e;
		paint();
	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}