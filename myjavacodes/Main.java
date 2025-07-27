package myjavacodes;

class Shape{
	public int area(int side) {  // area of square
		return side*side;
	}
	
	public int area(int length,int breadth) {  // Area of Rectangle
		return length*breadth;
	}
	
	public int perimeter(int side) {   // Perimeter of square
		return side*4;
	}
	
	public int perimeter(int length, int breadth) {
		return 2*(length+breadth);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		
		int sq_area=s.area(5);
		int rect_area=s.area(3,4);
		int sq_peri=s.perimeter(5);
		int rect_peri=s.perimeter(3,4);
		System.out.println("Area of Square:"+sq_area);
		System.out.println("Area of Rectangle:"+rect_area);
		System.out.println("Perimeter of Square:"+sq_peri);
		System.out.println("Perimeter of Reactanglle:"+rect_peri);
	}

}
