package nirvana006;
import java.util.*;
public class CollectionTest1 {
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("Hello world");
		c.add(new Integer(100));
		c.add(new Double(3.14));
		System.out.println(c);
	}
}
