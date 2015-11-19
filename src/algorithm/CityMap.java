package algorithm;

public class CityMap {
    public static int[][] map = new int[6][6];
    public static int[] book = new int[6];
    public static int min = 9999;
    public static int n = 5;// destination city number
    //cur is the current city number, dis is the current distance which have been passed through.
    protected static void dfs(int cur, int dis){
        if(dis>=min){
            return;
        }
        if(cur==n){
            if(dis<min) {
                min = dis;
            }
            return;
        }
        for(int i=1;i<=n;i++){   //judges whether there is a road between cur city and n city
            if(map[cur][i]!=9999&&book[i]==0){
                book[i] = 1;
                dfs(i,dis+map[cur][i]);
                book[i] = 0;
            }
        }
        return;
    }
    public static void main(String[] args){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    map[i][j] = 0;
                }
                else map[i][j] = 9999;
            }
        }
        map[1][2] = 2;//adds roads to the map
        map[1][5] = 10;
        map[2][3] = 3;
        map[2][5] = 7;
        map[3][1] = 4;
        map[3][4] = 4;
        map[4][5] = 5;
        map[5][3] = 3;

        book[1] = 1;
        dfs(1,0);
        System.out.println(min);
        for(int i =0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}
