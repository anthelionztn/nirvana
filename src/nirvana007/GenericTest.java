package nirvana007;
import java.util.*;
public class GenericTest {
	public static void main(String[] args){
		List<String> l1 = new LinkedList<String>();//ʹ�÷��ͣ�ǿ����list�еĶ���ֻ����String���͵�
		l1.add("hello");
		l1.add("world");
		for(Iterator<String> it=l1.iterator();it.hasNext();){
			String s = it.next();
			System.out.println(s);
		}
	}
}
