package nirvana006;
import java.util.*;
public class ListTest {
	public static void main(String[] args){
		List l = new LinkedList();
		for(int i=0;i<10;i++){
			l.add("a"+i);
		}
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "a7"));
	}
}
