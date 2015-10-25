package nirvana003;

public class CatEquals {
	public static void main(String[] args){
		Cat cat1 = new Cat(1,2,3);
		Cat cat2 = new Cat(1,2,3);
		System.out.println(cat1.equals(cat2));
	}
}

class Cat{
	int color;
	int height;
	int weight;
	public Cat(int i,int j,int k){
		this.color = i;
		this.height = j;
		this.weight = k;
	}
	//ÖØÐ´equalsº¯Êý
	public boolean equals(Object obj){
		if(obj==null) return false;
		else{
			if(obj instanceof Cat){
				Cat c = (Cat)obj;
				if(this.color==c.color&this.height==c.height&this.weight==c.weight){
					return true;
				}else return false;
			}
			else return false;			
		}
	}
}
