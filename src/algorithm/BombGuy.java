package algorithm;
//ģ��ը������Ϸ��ͨ��ö���ж�ը�������λ�ã�Ҫ����С���Ƿ����ߵ��Ǹ��㣬ʹ�ù����������
public class BombGuy {
	public static char[][] a = {{'#','#','#','#','#','#','#','#','#','#','#','#','#'},
								{'#','G','G','.','G','G','G','#','G','.','.','G','#'},
								{'#','#','#','.','#','G','#','G','#','.','#','G','#'},
								{'#','.','.','.','.','.','.','.','.','.','.','G','#'},
								{'#','G','G','.','G','G','G','#','G','G','.','.','#'},
								{'#','#','#','.','#','G','#','G','#','G','#','G','#'},
								{'#','.','.','.','.','.','.','.','#','.','.','G','#'},
								{'#','G','G','.','G','G','G','#','G','G','G','.','#'},
								{'#','#','#','.','#','G','#','G','#','G','#','G','#'},
								{'#','.','.','.','.','.','.','.','#','.','.','G','#'},
								{'#','G','G','.','G','G','G','#','G','G','G','.','#'},
								{'#','#','#','.','#','G','#','G','#','G','#','G','#'},
								{'#','#','#','#','#','#','#','#','#','#','#','#','#'}};
								//��ͼ��.Ϊ�յأ�#Ϊǽ��GΪ���
	
	public static int getNum(int i,int j){
		int sum,x,y;
		sum = 0;//������¼��������ĵ�����
		//����
		x = i;
		y = j;
		while(a[x][y]!='#'){
			if(a[x][y]=='G'){
				sum++;
			}
			x--;
		}
		//����
		x = i;
		y = j;
		while(a[x][y]!='#'){
			if(a[x][y]=='G'){
				sum++;
			}
			x++;
		}
		//����
		x = i;
		y = j;
		while(a[x][y]!='#'){
			if(a[x][y]=='G'){
				sum++;
			}
			y--;
		}
		//����
		x = i;
		y = j;
		while(a[x][y]!='#'){
			if(a[x][y]=='G'){
				sum++;
			}
			y++;
		}
		return sum;
	}
	
	public static void main(String[] args){

		Note[] que = new Note[401];//Ҫע���ʱ��ʼ��δ����������NullPointException
		for(int i=0;i<que.length;i++){
			que[i] = new Note();
		}
		int head, tail;
		head = 1;
		tail = 1;
		int[][] book = new int[20][20];
		for(int i=0;i<book.length;i++){
			for(int j=0;j<book[i].length;j++){
				book[i][j] = 0;
			}
		}
		
		int sum, max, mx, my,n, m,startx, starty, tx, ty;
		sum = 0;
		m = 13;//13��
		n = 13;//13��
		int[][] next = new int[][]{{0,1},	//����
								   {1,0},	//����
			 					   {0,-1},	//���� =
			 					   {-1,0}}; //����
		
		 //����С����ʼ����
		startx = 3;
		starty = 3;
		que[tail].x = startx;
		que[tail].y = starty;
		tail++;
		book[startx][starty] = 1;
		max = getNum(startx,starty);
		mx = startx;
		my = starty;

		while(head<tail){
			for(int k=0;k<3;k++){//ö���ĸ�����
				tx = que[head].x + next[k][0];
				ty = que[head].y + next[k][1];
				
				if(tx<0||tx>n-1||ty<0||ty>m-1){//�ж��Ƿ�Խ��
					continue;
				}
				if(a[tx][ty]=='.'&&book[tx][ty]==0){//�ж��Ƿ�Ϊƽ����û���߹�
					book[tx][ty] = 1;
					que[tail].x = tx;
					que[tail].y = ty;
					tail++;
					
					sum = getNum(tx,ty);
					if(sum>max){
						max = sum;
						mx = tx;
						my = ty;
					}
				}

			}//forѭ������
			head++;//һ������չ������Ҫ����һ���������չ
		}
		System.out.println("mx:"+mx);
		System.out.println("my:"+my);
		System.out.println("max:"+max);
	}
}
class Note{
	int x;//������
	int y;//������
}