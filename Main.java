package trainingAssignments;

	import java.util.Scanner;

	class Circle {
	    final double PI = 3.14159; // Constant value for PI
	    double radius;
	    double area;
	    double circumference;

	    // Method to accept radius from the user
	    public void acceptRadius() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the radius of the circle: ");
	        radius = scanner.nextDouble();
	        scanner.close();
	    }

	    // Method to calculate the area of the circle
	    public void calculateArea() {
	        area = PI * radius * radius;
	    }

	    // Method to calculate the circumference of the circle
	    public void calculateCircumference() {
	        circumference = 2 * PI * radius;
	    }

	    // Method to display the area and circumference of the circle
	    public void displayResult() {
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + area);
	        System.out.println("Circumference: " + circumference);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Circle circle = new Circle();
	        circle.acceptRadius();
	        circle.calculateArea();
	        circle.calculateCircumference();
	        circle.displayResult();
	    }
	}

