package nirvana005;

public class EnumTest {
	public enum Color{red,green,blue};
	public static void main(String[] args){
		Color c = Color.blue;
		switch(c){
		case red:
			System.out.println("The color is red.");
			break;
		case green:
			System.out.println("The color is green.");
			break;
		default:
			System.out.println("The color is blue.");
		}		
	}
}
