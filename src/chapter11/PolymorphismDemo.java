package chapter11;

public class PolymorphismDemo {
	/** Main method */
	public static void main(String[] args) {
		// Display circle and rectangle properties
		displayObject(new Circle(1, "red", false));
		displayObject(new RectangleFromGeometricObject(1, 1, "black", true));
	}

	/** Display geometric object properties */
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() + " Color is " + object.getColor());
	}

}
