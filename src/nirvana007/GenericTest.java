package nirvana007;
import java.util.*;
public class GenericTest {
	public static void main(String[] args){
		List<String> l1 = new LinkedList<String>();//使用泛型，强制了list中的对象只能是String类型的
		l1.add("hello");
		l1.add("world");
		for(Iterator<String> it=l1.iterator();it.hasNext();){
			String s = it.next();
			System.out.println(s);
		}
	}
}
