/**
 * This class contains a variable side, and getters and setters for side, and a method
 * that returns the area of a square.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Classes and Objects Review Project
 * Spring 2023
 */
public class Square {
	
	private int side;//side will be used as the square's side
	public Square() {
		side=0;
	}//end default constructor
	public Square(int n) {
		side =n;
	}// end preferred constructor
	
	/**
	 * This method is a getter method for the side variable
	 * 
	 * @return the value of the side variable
	 */
	
	public int getSide() {
		return side;
	}//end getSide
	
	/**
	 * This method is a setter method for the side variable
	 * 
	 * @param side is the value sent to this.side
	 */
	
	public void setSide(int side) {
		this.side = side;
	}// end setSide
	
	/**
	 * This method is used to find the area of the square
	 * @return the area of the square
	 */
	
	public double getArea() {
		return side * side;	
	}//end getArea
}//end class