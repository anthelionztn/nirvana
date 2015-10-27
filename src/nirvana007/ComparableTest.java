package nirvana007;
import java.util.*;
public class ComparableTest {
	public static void main(String[] args){
		List l = new LinkedList();
		l.add(new Name("Tunan","Zhang"));
		l.add(new Name("Wanting","Sun"));
		l.add(new Name("Sanfeng","Zhang"));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}
