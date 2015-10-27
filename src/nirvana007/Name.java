package nirvana007;
import java.util.*;
public class Name implements Comparable{
	String firstName;
	String lastName;
	Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int compareTo(Object o){
		Name n = (Name)o;
		int order = this.lastName.compareTo(n.lastName);
		return order!=0? order:this.firstName.compareTo(n.firstName);
	}
	
	public boolean equals(Object o){
		if(o instanceof Name){
			Name n = (Name)o;
			return this.firstName.equals(n.firstName)&&this.lastName.equals(n.lastName);
		}else return super.equals(o);
	}//��дequals����һ��Ҫ��дhashCode����
	
	public int hashCode(){
		return firstName.hashCode();
	}//firstName��String���͵��ַ���������String�����Ѿ���д��hashCode����
	
	public String toString(){
		return(this.firstName+" "+this.lastName);
	}
}
