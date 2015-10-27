package nirvana007;
import java.util.*;
public class MapTest {
	public static void main(String[] args){
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		Map<String,Integer> m2 = new TreeMap<String,Integer>();
		m1.put("one", new Integer(1));
		m1.put("two", 2);//auto-boxing
		m1.put("three", 3);
		m2.put("A", 1);
		m2.put("B", 23);
		System.out.println(m1.size());
		System.out.println(m1.containsKey("two"));
		System.out.println(m1.containsValue(1));//auto-boxing
		if(m1.containsKey("one")){
			int i = m1.get("one");//auto-unboxing
			System.out.println(i);
		}
		Map m3 = new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);
	}
}
