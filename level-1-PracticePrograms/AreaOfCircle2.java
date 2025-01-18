//Creating the class for calculating the area of circle;
import java.util.Scanner;

class Circle{
    // declaring the variable or attribute
    double radius;
	double area;
	double circumference;

    // initializing the variable through
	Circle(double radius){
	  this.radius = radius;	
	}
	
	//method to calculate area of circle
	public double areaOfCircle(){
		area = 3.14 * radius * radius;
		return area;
	}
	
	//method to calculate circumfernece
	public double circumFerence(){
		 circumference = 2 * 3.14 * radius;
		return circumference;
	}
	
	//method for displaying the area and circumference of circle
	public void display(Double radius){
		
		//calling areaOfCircle and circumFerence method
		areaOfCircle();
		circumFerence();
		
		System.out.println("The radius of the circle is : "+ radius);
		System.out.println("The Area of the circle is : "+area);
		System.out.println("The Circumference of the circle is : "+circumference);
		
	}
	
}

public class AreaOfCircle2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		//taking input radius from user
		System.out.println("Enter the radius of circle");
		double radius = sc.nextDouble();
		
		// creating the object 
		Circle obj = new Circle(radius);
		
		//calling the display method through the object 
		obj.display(radius);
	}
}



