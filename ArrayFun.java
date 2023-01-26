/**
 * This ArrayFun class creates an array of size 6 using objects from the Square class,
 * getters and setters for ArrayItem, and forward, backward, and sum methods.
 * @author Aaron Weedman
 *
 */
public class ArrayFun {

	private Square[] myArray;//an array called myArray is created, using objects from the Square class.
	
	public ArrayFun() {
		
	myArray = new Square[6];//creates a new array of size 6 (square with side length 1-6)
	for(int i=0; i<6; i++) {
		myArray[i] = new Square(i);
	}//end for loop
	}//end constructor
	
	/**
	 * This method is a setter method for the Array Item
	 * @param index the first value sent to the method
	 * @param s the second value sent to the method
	 * 
	 */
	public void setArrayItem(int index, Square s) {
	myArray[index] = s;
	}//end SetArrayItem
	
	/**
	 * This method is a getter method for Array Item
	 * @param index 
	 * @return myArray[index] (a square object)
	 * 
	 */

	public Square getArrayItem(int index) {
        return myArray[index];
    }//end getArrayItem
	
	/**
	 * The forward method runs a for loop starting at 0, ending at 5
	 * and prints out the square's side length and area.
	 * 
	 */
	public void forward() {
        for(int i=0; i<6; i++) {
            System.out.println("Square with side length " + i + " has area: " + myArray[i].getArea());
        }//end for loop
    }//end forward
	
	/**
	 * The backward method runs a for loop starting at 5, ending at 0
	 * and prints out the square's side length and area.
	 * 
	 */
	public void backward() {
        for(int i=6-1; i>-1; i--) {
            System.out.println("Square with side length " + i + " has area: " + myArray[i].getArea());
        }//end for loop
    }//end backward
	
	/**
	 * The sum method runs a for loop and adds up all the areas it iterated through to get
	 * the total
	 * 
	 */
	 public void sum() {
		 int total = 0;
	        for(int i=0; i<6; i++) {
	            total += myArray[i].getArea();
	        }//end for loop   
	        System.out.println("Total area of all squares: " + total);
	    }//end sum
	}//end class