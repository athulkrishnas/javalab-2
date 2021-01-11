
import java.util.Scanner;
public class Area1
 {
	
	void rectcircle(double length,double breadth){
		
		String area=String.format("%.3f", (length*breadth));
		System.out.println("Area of Rectange Is "+area+"");
	}
	
	void rectcircle(double radius){
		
		double pi = 3.14;
		String area= String.format("%.3f", (pi*Math.pow(radius, 2)));
		System.out.println("Area of Circle is "+area+"");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r,l,b;
		
		System.out.println("Enter radius of circle ");
		r =sc.nextDouble();
		Area1 circle = new Area1();
		circle.rectcircle(r);

		
		System.out.println("Enter  length and breadth of rectangle ");
		l = sc.nextDouble();
		b=sc.nextDouble();
		Area1 rectangle = new Area1();
		rectangle.rectcircle(l, b);
		
	
	}
	

}