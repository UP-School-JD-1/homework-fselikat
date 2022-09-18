package hw_9_3_point;

public class PointTest {

	public static void main(String[] args) {
		Point point1 = new Point (5,12);
		Point point2 = new Point (7);
		Point clonePoint1= new Point();
		Point clonePoint2= new Point();
		
		
		
		System.out.println("("+point1.getX()+"," +point1.getY()+") noktasının orijine uzaklığı:"+ point1.calculateDistanceToOrigin() );
		System.out.println("("+point2.getX()+"," +point2.getY()+") noktasının orijine uzaklığı:"+ point2.calculateDistanceToOrigin() );
		
	
		
		System.out.println("("+point1.getX()+"," +point1.getY()+") noktasının (-5,-12) noktasına uzaklığı:"+ point1.calculateDistanceToAPoint(-5,-12) );
		System.out.println("("+point2.getX()+"," +point2.getY()+") noktasının (6,8) noktasına uzaklığı:"+ point2.calculateDistanceToAPoint(6,8) );
		
		 
		System.out.print("("+point1.getX()+"," +point1.getY()+") noktasının x ekseninde 3  birim ilerletilmiş hali:");
		point1.move('X', 3);
		System.out.println("("+point1.getX()+"," +point1.getY()+")");
		System.out.print("("+point2.getX()+"," +point2.getY()+") noktasının y ekseninde -2  birim ilerletilmiş hali:");
		point2.move('y', -2);
		System.out.println("("+point2.getX()+"," +point2.getY()+")");
		
		
		
		System.out.println("("+point1.getX()+"," +point1.getY()+") noktası"+"("+clonePoint1.getX()+"," +clonePoint1.getY()+")"+ "noktasına kopyalanıyor ..." );
		clonePoint1= point1.clone();
		System.out.println("("+clonePoint1.getX()+"," +clonePoint1.getY()+"şeklinde kopyalandı");
		
		

		

	}

}
