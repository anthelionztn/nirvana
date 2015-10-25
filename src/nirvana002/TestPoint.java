package nirvana002;

public class TestPoint {
	public static void main(String[] args){
		Point p = new Point(1,2,3);
		Point zero = new Point(0,0,0);
		System.out.println(p.distance(zero));
		p.setX(5);
		p.setY(4);
		p.setZ(3);
		System.out.println(p.distance(zero));
	}
}
