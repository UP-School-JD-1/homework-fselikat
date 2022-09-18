package hw_9_3_point;

public class Point {


	int x;
	{
	
		x = 0;
	}
	int y;
	{
		y = 0;
	}
	Point(int x,int y) {
		this.x=x;
		this.y=y;	
	}
	Point (){
		this(0,0);
	}
	Point (int x){
		this(x, x);
	}

	
	public int getX(){
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y) {
		this.y = y;
		
	}
	public double calculateDistanceToOrigin() {
		double distance = Math.sqrt((x * x)+(y * y));
		return distance;
		
	}
	public double calculateDistanceToAPoint(int x, int y) {
		double distance = Math.sqrt( Math.pow ((x-this.x),2)+ Math.pow( (y - this.y), 2));
		return distance;
	}
		
	
	
	public  Point clone() {
		Point clone = new Point(getX(),getY());
		return clone;
	
		
		
	}
	public void move(char axis, int value) {
		if(axis=='x'||axis=='X') {
			x = x + value;
		}
		else if(axis=='y'||axis=='Y') {
			y = y + value;
		}
		else
			System.out.println("invalid text!.");
		
		
		
	}
	

}
