package nirvana002;
//使用非递归方法计算斐波那契数列
public class fabonice {
	public static long fab(int i){
		if(i<1){
			System.out.println("error");
			return -1;
		}
		long temp1 = 1L;
		long temp2 = 1L;
		long res = 0L;
		int cnt = 1;
		if(i==1|i==2){
			return 1;
		}
		while(cnt<=i-2){
			res = temp1 + temp2;
			temp2 = temp1;
			temp1 = res;
			cnt++;
		}
		return res;
	}
	
	public static void main(String[] args){
		long res = fab(40);
		System.out.println(res);
	}
}
