package algorithm;
/*10��ѧ��������ĩ����������ɺ�A��ʦ��Ҫ���������ߣ�Ҫ�����£�
(1) ��������10�ı�����
(2) ��֤������60%��ѧ������
(3) ������е�ѧ��������60�֣��򼰸���Ϊ60��
*/
public class PassLevel {
	public static void main(String[] args){
		int rl;
		int[] arr = {45,74,27,87,58,98,33,77,25,98};
		QuickSortArr a = new QuickSortArr(arr);
		a.qs(0, a.arr.length-1);
		for(int i=0;i<a.arr.length;i++){
			System.out.print(a.arr[i]+" ");
		}
		System.out.println();
		if(a.arr[0]>=60){
			rl = 60;
		}else if(a.arr[4]%10==0){
			rl = a.arr[4];
		}else{
			rl = (a.arr[4]/10)*10;
		}
		System.out.println("result: "+rl);
		
	}
}
class QuickSortArr{
	int[] arr;
	public QuickSortArr(int[] arr){
		this.arr = arr;
	}
	public void qs(int left, int right){
		int i,j,t,tmp;
		int cnt = 1;
		if(left>right){
			return;
		}
		tmp = arr[left];	//tmp�д���ǻ�׼��
		i = left;
		j = right;	//left��right���������ڱ�
		while(i!=j){
			while(arr[j]>=tmp&&i<j){
				j--;
			}	//�ȴ���������
			while(arr[i]<=tmp&&i<j){
				i++;
			}	//�ٴ���������
			if(i<j){	//�������ڱ���û����ʱ
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}	//����ij��������λ��
		}
		arr[left] = arr[i];
		arr[i] = tmp;	//��׼����λ
		System.out.println(cnt++);
		qs(left,i-1);	//����������ߵ�
		qs(i+1,right);	//���������ұߵ�	
	}
}