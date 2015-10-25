package nirvana004;

public class Count3Minus1 {
	public static void main(String[] args){
		boolean[] circle = new boolean[500];
		for(int i=0;i<circle.length;i++){
			circle[i] = true;
		}//初始化数组所有元素为true
		int index = 0;//数到第几个人
		int leftnum = circle.length;//剩余人数
		int cnt = 0;//数3计数器
		while(leftnum>1){
			if(circle[index]==true){
				cnt++;
			}
			if(cnt==3){
				circle[index]=false;
				cnt = 0;
				leftnum--;
			}
			index++;
			if(index==circle.length){
				index = 0;
			}
		}
		for(int i=0;i<circle.length;i++){
			if(circle[i]==true){
				System.out.println(i);
			}
		}
		
	}
}
