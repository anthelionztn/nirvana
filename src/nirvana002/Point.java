package nirvana002;

public class Point {
	private int x;
	private int y;
	private int z;
	Point(int i,int j,int k){
		this.x = i;
		this.y = j;
		this.z = k;
	}
	public void setX(int i){
		this.x = i;
	}
	public void setY(int j){
		this.y = j;
	}
	public void setZ(int k){
		this.z = k;
	}
	public int distance(Point p){
		return (this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)+(this.z-p.z)*(this.z-p.z);
	}
}
