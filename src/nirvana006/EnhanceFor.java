package nirvana006;
import java.util.*;
public class EnhanceFor {
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add(new String("Hello "));
		c.add(new String("world"));
		c.add(new String(", Naitang."));
		for(Object o:c){
			System.out.print(o);
		}
		System.out.println();
	}
}
