package algorithm;
public class DepthFirstSearch {
	public static int [] a = new int[10];
	public static int [] book = new int[10];
	public static int n = 3;
	public static void dfs(int step){	//step表示现在站在第几个盒子面前
		int i;
		if(step==n+1){	//如果站在第n+1个盒子前，则表示前n个盒子已经放好扑克牌
			//输出一种排列（1~n号盒子中的扑克编号）
			for(i=1;i<=n;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
			return;	//返回上次调用dfs函数的地方
		}
		//此时站在第step个盒子面前，应该放哪张牌呢？按照1,2,3...n的顺序一一尝试
		for(i=1;i<=n;i++){
			//判断扑克是否还在手上
			if(book[i]==0){	//开始尝试使用扑克i
				a[step] = i;	//将扑克i放进第step号盒子里
				book[i] = 1;
				dfs(step+1);	//第step个盒子已经放好扑克，接着走到下一个盒子面前
				book[i] = 0;	//将刚才尝试的扑克牌收回才能进行下一次尝试
			}
		}
		return;
	}	
	public static void main(String[] args) {
		dfs(1);	//首先站在1号盒子面前	
	}
}