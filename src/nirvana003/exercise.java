package nirvana003;
//继承、接口等内容联系
public class exercise {
	public static void main(String[] args){
		Employee e = new Employee(22,8000,"4749","Li Gang","Chengdu");
		Manager m = new Manager(25,10000,"8888","Zhang Tunan","Beijing");
		e.addWage();
		m.addWage();
		System.out.println(e.wage);
		System.out.println(m.wage);
	}
}
abstract class Persion{
	private String name;
	private String address;
	Persion(String name, String address){
		this.name = name;
		this.address = address;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getName(){
		return this.name;
	}
}

interface Add{
	void addWage();
}

class Employee extends Persion implements Add{
	int age;
	double wage;
	String id;
	public Employee(int age,double wage,String id,String name,String address){
		super(name,address);
		this.age = age;
		this.wage = wage;
		this.id = id;
	}
	public void addWage(){
		this.wage = this.wage*1.1;
	}
}

class Manager extends Employee implements Add{
	public Manager(int age,double wage,String id,String name, String address){
		super(age,wage,id,name,address);
	}
	public void addWage(){
		this.wage = this.wage*1.2;
	}
}