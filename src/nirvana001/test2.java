package nirvana001;
//输出101至200间的所有质数
public class test2 {
	public static void main(String[] args){
		int i = 101;
		while(i<=200){
			boolean r = true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					r = false;
					break;
				}
			}
			if(r){
				System.out.println(i);
			}
			i+=2;
		}
	}
}
