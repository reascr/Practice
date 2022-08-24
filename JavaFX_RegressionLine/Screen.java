package assignment12;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Screen extends Application{
	/**
	 * This class contains the graphical programming: the scene and stage.
	 */
	
	//private LinkedList<Circle> points = new LinkedList<>();

	public void init() {
	}
	
	/**
	 * This method creates a Scene and a Stage object and shows them.
	 * @param primaryStage - an object of the class javafx.stage.Stage
	 */
	@Override
	public void start(Stage primaryStage) throws Exception { 
		
		Pane root = new Pane(); 

		root.setOnMouseClicked(new MouseClick(root));
//		root.setOnMouseClicked(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				double x = event.getX();
//				double y = event.getY();
//				
//				Circle c = new Circle();
//				c.setCenterX(x);
//				c.setCenterY(y);
//				c.setRadius(4);
//				
//				points.add(c);
//		        root.getChildren().add(c);
//		        if (points.size() == 2) {
//		        	l = new line(0,0,0,0);
	//              // add to children
//		        }
//		        if (points.size() >= 2) {
//		        	upadteline();
//		        }
//			}
//			
//			
//		}
		
		
		Scene scene = new Scene(root, 300, 300); 
		
		primaryStage.setTitle("Regression Analysis");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
//	private void updateLine() {
//		double avgX = 0.0;
//		double avgY = 0.0;
//		for(Circle c: points) {
//			avgX += c.getCenterX() / points.size();
//			avgY += c.getCenterY() / points.size();
	
//		}
//	double slope(calcSlope(avgX, avgY);
//	double intersection = calcIntersection(avgX, avgY, slope);
//	l.setStartX(0);
//	l.setStartY(intersection);
//	l.setEndX(700);
//	l.setEndY(insersection+slope * 700);
//	}
//	
//	private double calcSlope(double avgX, double avgY) {
//		double numerator = 0.0;
//		double denominator = 0.0;
//		for(Circle c: points) {
//			numerator += (c.getCenterX() - avgX) * (c.getCenterY() -avgY);
//			denominator += (c.getCenterX() - avgX) * (c.getCenterX() -avgX);
//			
//		}
//		return numerator/denominator;
//	}
//	private double calcIntersection(double avgX, double avgY, double slope) {
//		return avgY - slope * avgX;
//	}

}
