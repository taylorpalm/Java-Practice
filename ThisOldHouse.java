//Taylor Palm

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.effect.Glow;


public class ThisOldHouse extends Application {

	public static void main(String[] args) {
    
		launch(args);

	}
	
	@Override
	public void start (Stage primaryStage)
	{
		final double SCENE_WIDTH =500;
		final double SCENE_HEIGHT = 500;
		
		//House body
		
		Rectangle houseBody = new Rectangle(200, 200, Color.ANTIQUEWHITE);
		houseBody.setX(150);
		houseBody.setY(300);
		houseBody.setStroke(Color.BROWN);
		
		//Door frame
		
		Rectangle door = new Rectangle(50, 75, Color.BROWN);
		door.setX(225);
		door.setY(425);
		door.setStroke(Color.BLACK);
		
		//Door handle
		Circle handle = new Circle(235, 465, 5);
		
		//Window 1
		
		Rectangle window1 = new Rectangle(40, 40, Color.AZURE);
		window1.setX(175);
		window1.setY(360);
		window1.setStroke(Color.BLACK);
		
		Line window1Line1 = new Line(175, 380, 215, 380);
		Line window1Line2 = new Line(195, 360, 195, 400);
		
	    //Window 2
		
		Rectangle window2 = new Rectangle(40, 40, Color.AZURE);
		window2.setX(285);
		window2.setY(360);
		window2.setStroke(Color.BLACK);
		
		Line window2Line1 = new Line(285, 380, 325, 380);
		Line window2Line2 = new Line(305, 360, 305, 400);
		
		//Ground
		
		Rectangle ground = new Rectangle(500, 30, Color.DARKGREEN);
		ground.setX(0);
		ground.setY(470);
		
		//Sky
		
		Rectangle sky = new Rectangle(500, 470, Color.MIDNIGHTBLUE);
		sky.setX(0);
		sky.setY(0);
		
		//Roof
		
		Polygon roof = new Polygon(100, 325, 250, 190, 400, 325);
		roof.setFill(Color.SADDLEBROWN);
		roof.setStroke(Color.BLACK);
		
		//moon
		
		Arc moon = new Arc(500, 0, 150, 150, 180, 90);
		moon.setType(ArcType.ROUND);
		moon.setFill(Color.ALICEBLUE);
		
		Glow glow = new Glow();
		glow.setLevel(1);
		moon.setEffect(glow);
		
		
		//STARS
		
		
		Polygon star1Top= new Polygon(20, 22, 15, 15, 10, 22);
				star1Top.setFill(Color.GHOSTWHITE);
		
		Polygon star1Bot= new Polygon(10, 18, 15, 25, 20, 18);
				star1Bot.setFill(Color.GHOSTWHITE);
				
		Polygon star2Top= new Polygon(70, 72, 65, 65, 60, 72);
				star2Top.setFill(Color.GHOSTWHITE);
		
		Polygon star2Bot= new Polygon(60, 68, 65, 75, 70, 68);
				star2Bot.setFill(Color.GHOSTWHITE);
		
		Polygon star3Top= new Polygon(170, 172, 165, 165, 160, 172);
				star3Top.setFill(Color.GHOSTWHITE);
		
		Polygon star3Bot= new Polygon(160, 168, 165, 175, 170, 168);
				star3Bot.setFill(Color.GHOSTWHITE);
				
		Polygon star4Top= new Polygon(270, 132, 265, 125, 260, 132);
				star4Top.setFill(Color.GHOSTWHITE);
		
		Polygon star4Bot= new Polygon(260, 128, 265, 135, 270, 128);
				star4Bot.setFill(Color.GHOSTWHITE);
		
		Polygon star5Top= new Polygon(190, 32, 185, 25, 180, 32);
				star5Top.setFill(Color.GHOSTWHITE);
		
		Polygon star5Bot= new Polygon(180, 28, 185, 35, 190, 28);
				star5Bot.setFill(Color.GHOSTWHITE);		
				
		Polygon star6Top= new Polygon(40, 222, 35, 215, 30, 222);
				star6Top.setFill(Color.GHOSTWHITE);
		
		Polygon star6Bot= new Polygon(30, 218, 35, 225, 40, 218);
				star6Bot.setFill(Color.GHOSTWHITE);		
						
		Polygon star7Top= new Polygon(390, 232, 385, 225, 380, 232);
				star7Top.setFill(Color.GHOSTWHITE);
		
		Polygon star7Bot= new Polygon(380, 228, 385, 235, 390, 228);
				star7Bot.setFill(Color.GHOSTWHITE);	
				
		Polygon star8Top= new Polygon(490, 202, 485, 195, 480, 202);
				star8Top.setFill(Color.GHOSTWHITE);
		
		Polygon star8Bot= new Polygon(480, 198, 485, 205, 490, 198);
				star8Bot.setFill(Color.GHOSTWHITE);	
				
		
		Pane stars= new Pane (star1Top, star1Bot, star2Top, star2Bot, 
	             star3Top, star3Bot, star4Top, star4Bot, star5Top, star5Bot,
	             star6Top, star6Bot, star7Top, star7Bot, star8Top, star8Bot);
		
		FadeTransition fade = new FadeTransition(Duration.seconds(3), stars);
		
	    fade.setFromValue(1.0);
	    fade.setToValue(0.25);
	    fade.setCycleCount(Animation.INDEFINITE);
	    fade.setAutoReverse(true);
	    fade.play();
	    	
		
		Pane restOfPane = new Pane(ground, sky, moon, houseBody, roof, door, 
				 handle, window1, window1Line1, 
	             window1Line2, window2, window2Line1, window2Line2);
		
		Pane rootPane = new Pane(restOfPane, stars);
		
		Scene scene = new Scene(rootPane, SCENE_WIDTH, SCENE_HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Taylor Palm, December 2 2018");
		primaryStage.show();
	}

}
