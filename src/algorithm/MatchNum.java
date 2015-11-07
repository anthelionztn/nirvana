package algorithm;

public class MatchNum {
	public static int fun(int x){
		int num = 0;
		int[] arr = {6,2,5,5,4,5,6,3,7,6};
		while(x/10!=0){
			num+=arr[x%10];
			x = x/10;
		}
		num+=arr[x];
		return num;
	}
	public static void main(String[] args){
		int a,b,c;
		int cnt = 0;
		int matchNum = 18;
		for(a = 0;a<=1111;a++){
			for(b = 0;b<1111;b++){
				c = a + b;
				if(fun(a)+fun(b)+fun(c)==matchNum-4){//加号和等号要用掉4根火柴
					System.out.println(a+"+"+b+"="+c);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
