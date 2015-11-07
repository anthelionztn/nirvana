package algorithm;
public class DepthFirstSearch {
	public static int [] a = new int[10];
	public static int [] book = new int[10];
	public static int n = 3;
	public static void dfs(int step){	//step��ʾ����վ�ڵڼ���������ǰ
		int i;
		if(step==n+1){	//���վ�ڵ�n+1������ǰ�����ʾǰn�������Ѿ��ź��˿���
			//���һ�����У�1~n�ź����е��˿˱�ţ�
			for(i=1;i<=n;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
			return;	//�����ϴε���dfs�����ĵط�
		}
		//��ʱվ�ڵ�step��������ǰ��Ӧ�÷��������أ�����1,2,3...n��˳��һһ����
		for(i=1;i<=n;i++){
			//�ж��˿��Ƿ�������
			if(book[i]==0){	//��ʼ����ʹ���˿�i
				a[step] = i;	//���˿�i�Ž���step�ź�����
				book[i] = 1;
				dfs(step+1);	//��step�������Ѿ��ź��˿ˣ������ߵ���һ��������ǰ
				book[i] = 0;	//���ղų��Ե��˿����ջز��ܽ�����һ�γ���
			}
		}
		return;
	}	
	public static void main(String[] args) {
		dfs(1);	//����վ��1�ź�����ǰ	
	}
}