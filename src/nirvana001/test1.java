package nirvana001;
//输出1-100内前5个能被3整除的数
public class test1 {
	public static void main(String[] args){
		int cnt = 0;
		for(int i=1;i<=100;i++){
			if(i%3==0){
				System.out.println(i);
				cnt++;
			}
			if(cnt==5) break;
		}
	}
}
