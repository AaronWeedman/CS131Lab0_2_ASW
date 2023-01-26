/**
 * This Application class calls upon the methods from the ArrayFun and Square classes
 * to output the area of a square (from Lab 0.1), then it will print the area of each square
 * in the array from first to last, then last to first. Finally, it will sum the areas of the squares.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Arrays Project
 * Spring 2023
 */
public class Application {
	
public static void main(String[] args) {
		
		Square square = new Square(2);//creates instance of square class and sets the value of side to 2
		System.out.println("Square area: " + square.getArea());//prints the area of the square
		
	
        ArrayFun arrayFun = new ArrayFun();//creates instance of ArrayFun class
        
        System.out.println();
        System.out.println("Forward");//prints "Forward"
        arrayFun.forward();
        
        System.out.println();
        System.out.println("Backwards");//prints "Backwards"
        arrayFun.backward();
        
        System.out.println();
        System.out.println("Sum");//prints "Sum"
        arrayFun.sum();
    }//main
}//class