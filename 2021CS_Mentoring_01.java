import java.util.*;

public class Program{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome to Math Lines APP");
		double xA, yA, xB, yB;
		double slope, length;
		double midPointX, midPointY;
		
		System.out.print("Enter in xA: ");
		xA=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter in yA: ");
		yA=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter in xB: ");
		xB=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter in yB: ");
		yB=Double.parseDouble(sc.nextLine());
		
		slope=(yB-yA)/(xB-xA);
		length=Math.sqrt(((yB-yA)*(yB-yA))+((xB-xA)*(xB-xA)));
		
		System.out.println("Slope: "+(Math.round(slope * 100.0) / 100.0));
		System.out.println("Length: "+(Math.round(length * 100.0) / 100.0));
		
		midPointX=(xA+xB)/2;
		midPointY=(yA+yB)/2;
		
		System.out.println("Midpoint: ("+(Math.round(midPointX * 10.0) / 10.0)+", "+(Math.round(midPointY * 10.0) / 10.0)+")");
	}
}
