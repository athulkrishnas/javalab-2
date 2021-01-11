import java.util.Scanner;

public class Area{
	
	String a= "";

	Area(double length,double breadth){	
		a=String.format("%.3f", (length*breadth));
	}
	String returnArea() {
		return this.a;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  length and beadth of rectangle :");
		double length = sc.nextDouble();
		double breadth=sc.nextDouble();
		Area ob = new Area(length,breadth);
		String a = "";
		a=ob.returnArea();
		System.out.println("Area of rectangle = "+a);
		
		
	}

	
}