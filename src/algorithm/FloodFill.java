package algorithm;

public class FloodFill {
    public static int[][] a = new int[51][51];
    public static int m = 50;
    public static int n = 50;
    public static int[][] book = new int[51][51];
    public static void dfs(int x, int y, int color){
        int[][] next = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int tx, ty;
        a[x][y] = color;
        for(int k=0;k<3;k++){
            tx = x + next[k][0];
            ty = y + next[k][1];
            if(tx<1||tx>n||ty<0||ty>m){
                continue;
            }
            if(a[tx][ty]>0&&book[tx][ty]==0){
                book[tx][ty] = 1;
                dfs(tx, ty, color);
            }
        }
        return;
    }

    public static void main(String[] args){
        int num = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(a[i][j]>0){
                    num++;
                    book[i][j] = 1;
                    dfs(i,j,num);
                }
            }
        }
    }
}
