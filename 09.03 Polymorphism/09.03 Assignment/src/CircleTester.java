import java.util.ArrayList;

/*
 * Purpose: Test the Circle class and its subclasses
 * 
 * Author: Burgess Doan
 * Date: 26 April 2022
 * 
 */
public class CircleTester {

	public CircleTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Circle2 circle = new Circle2(5, 5, 25);
		Cylinder2 cylinder = new Cylinder2(10, 10, 50, 10);
		Oval2 oval = new Oval2(15, 15, 75, 100);
		OvalCylinder2 ovalCylinder = new OvalCylinder2(20, 20, 150, 175, 125);

		ArrayList<Circle2> shapes = new ArrayList<Circle2>();
		
		shapes.add(circle);
		shapes.add(cylinder);
		shapes.add(oval);
		shapes.add(ovalCylinder);
		
		for(int i = 0; i < shapes.size(); i++)
		System.out.println("For this " + shapes.get(i).getName() + " the center is at " + showCenter(shapes.get(i)));
		
	}
	
	public static String showCenter(Circle2 shapes) {
		return shapes.getCenter();
	}

}
