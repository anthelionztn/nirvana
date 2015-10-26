package nirvana006;
import java.util.*;
public class HashSetTest {
	public static void main(String[] args){
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("a");
		s1.add(1);
		s1.add("b");
		s2.add("b");
		s2.add(1);
		Set s3 = new HashSet(s2);
		s3.retainAll(s1);
		System.out.println(s3);
		Set s4 = new HashSet(s1);
		s4.addAll(s2);
		System.out.println(s4);
	}
}
