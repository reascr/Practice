package assignment12;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class MouseClick implements EventHandler<MouseEvent>{
	/**
	 * This class allows the user to place circles on to the Pane by clicking it and if there are two or more circles draws a regression line between them.
	 */
	
	// Properties / Fields
	
	private Pane root;
	private Line line;
	
	// Constructor
	
	/**
	 * This contructor creates an Object of the Type MouseClick.
	 * @param root -  the root node of the Pane. 
	 */
	public MouseClick(Pane root) {
		this.root = root;
		
	}
	@Override
	public void handle(MouseEvent event) {
		
		Circle circ = new Circle();
		circ.setRadius(10);
		circ.setFill(Color.DEEPPINK);
		circ.setCenterX(event.getX());
		circ.setCenterY(event.getY());
		this.root.getChildren().add(circ); // add circle to Scene
		
		this.root.getChildren().remove(this.line); // remove last Line
	
		
		if(this.root.getChildren().size() >=2) {
			Line line = new Line();
		

			double sumAllX = 0; // the sum of the x values of all circles
			double sumAllY = 0; // the sum of the y values of all circles
			
			double countCircles = (double) this.root.getChildren().size();
			
			for(Node c: this.root.getChildren()) { 
				if(c instanceof Circle) {
					Circle circle = (Circle) c;
					sumAllX += circle.getCenterX();
					sumAllY += circle.getCenterY();
				}
				
			}
			
			double averageX = sumAllX/ countCircles; 
			double averageY = sumAllY/ countCircles;
	
			
			// calculate the slope 
			
			double numerator = 0; // upper part of the Equation (sorry, I guess there is a smarter way to do this...)
			double denominator = 0; // lower part of the Equation
			
			for(Node c: this.root.getChildren()) {
				if(c instanceof Circle) {
					Circle circle = (Circle) c;
					numerator += ((circle.getCenterX() - averageX) * (circle.getCenterY() - averageY));
					denominator += ((circle.getCenterX() - averageX) * (circle.getCenterX() - averageX));
				}
				
				
			}
			
			double slope = numerator/denominator;
			double interY = averageY - slope*averageX; // intersection with y-axis
			
			
			
			// calculate start and end points for the y coordinate (y = m*x + b)
			
			double startY = slope*10 + interY;
			double endY = slope*280 + interY;
			
			
			line.setStartX(10); 
			line.setStartY(startY);
			line.setEndX(280);
			line.setEndY(endY);
			
			this.line = line; // set new Line to this.line
			this.root.getChildren().add(this.line); // add new line to the root node
		}
			
		
		
	}
	
	
	
}
