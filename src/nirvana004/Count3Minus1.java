package nirvana004;

public class Count3Minus1 {
	public static void main(String[] args){
		boolean[] circle = new boolean[500];
		for(int i=0;i<circle.length;i++){
			circle[i] = true;
		}//��ʼ����������Ԫ��Ϊtrue
		int index = 0;//�����ڼ�����
		int leftnum = circle.length;//ʣ������
		int cnt = 0;//��3������
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
