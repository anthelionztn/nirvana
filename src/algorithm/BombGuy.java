package algorithm;
//模拟炸弹人游戏，通过枚举判断炸弹的最佳位置，要考虑小人是否能走到那个点，使用广度优先搜索
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
								//地图（.为空地；#为墙；G为怪物）
	
	public static int getNum(int i,int j){
		int sum,x,y;
		sum = 0;//用来记录可以消灭的敌人数
		//向上
		x = i;
		y = j;
		while(a[x][y]!='#'){
			if(a[x][y]=='G'){
				sum++;
			}
			x--;
		}
		//向下
		x = i;
		y = j;
		while(a[x][y]!='#'){
			if(a[x][y]=='G'){
				sum++;
			}
			x++;
		}
		//向左
		x = i;
		y = j;
		while(a[x][y]!='#'){
			if(a[x][y]=='G'){
				sum++;
			}
			y--;
		}
		//向右
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

		Note[] que = new Note[401];//要注意此时初始化未结束，会抛NullPointException
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
		m = 13;//13列
		n = 13;//13行
		int[][] next = new int[][]{{0,1},	//向右
								   {1,0},	//向下
			 					   {0,-1},	//向左 =
			 					   {-1,0}}; //向上
		
		 //插入小人起始坐标
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
			for(int k=0;k<3;k++){//枚举四个方向
				tx = que[head].x + next[k][0];
				ty = que[head].y + next[k][1];
				
				if(tx<0||tx>n-1||ty<0||ty>m-1){//判断是否越界
					continue;
				}
				if(a[tx][ty]=='.'&&book[tx][ty]==0){//判断是否为平地且没被走过
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

			}//for循环结束
			head++;//一个点扩展结束，要对下一个点进行扩展
		}
		System.out.println("mx:"+mx);
		System.out.println("my:"+my);
		System.out.println("max:"+max);
	}
}
class Note{
	int x;//横坐标
	int y;//纵坐标
}