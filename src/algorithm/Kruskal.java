package algorithm;
/*
最小生成树算法
 */
public class Kruskal {

    static Edge[] e = new Edge[10];
    static int[] f = new int[7];//并查集数组
    static int sum = 0;
    static int count = 0;

    static void quickSort(int left, int right){
        Edge t;
        int i,j;
        if(left>right) return;

        i = left;
        j = right;
        while (i!=j){
            while (e[j].w>=e[left].w && i<j){
                j--;
            }
            while (e[i].w<=e[left].w && i<j){
                i++;
            }
            if(i<j){
                t = e[i];
                e[i] = e[j];
                e[j] = t;
            }
        }

        t = e[left];
        e[left] = e[i];
        e[i] = t;

        quickSort(left,i-1);
        quickSort(i+1, right);
        return;
    }

    //并查集寻找祖先函数
    static int getf(int v){
        if(f[v]==v){
            return v;
        }else{
            f[v] = getf(f[v]);
            return f[v];
        }
    }
    //并查集合并两子集函数
    static int merge(int v, int u){
        int t1, t2;
        t1 = getf(v);
        t2 = getf(u);
        if(t1!=t2){//如果不在一个集合中
            f[t2] = t1;
            return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        int n = 6;
        int m = 9;
        e[0] = new Edge(2,4,11);
        e[1] = new Edge(3,5,13);
        e[2] = new Edge(4,6,3);
        e[3] = new Edge(5,6,4);
        e[4] = new Edge(2,3,6);
        e[5] = new Edge(4,5,7);
        e[6] = new Edge(1,2,1);
        e[7] = new Edge(3,4,9);
        e[8] = new Edge(1,3,2);

        quickSort(0,m-1);
        //并查集初始化
        for(int i=0;i<n;i++){
            f[i] = i;
        }
        //Kruskal算法核心部分

        for(int i=0;i<m;i++){
            if(merge(e[i].u,e[i].v)==1){//判断一条边的两个顶点是否已经连通，即判断是否已经在同一阵营。
            // 如果尚不连同，则选用这条边。merge()方法运行后会把这两个顶点连通。
                count++;
                sum+=e[i].w;
            }

            if(count==n-1) break;//直到选用了n-1条边后结束循环
        }
        System.out.println(sum);
    }
}
class Edge{
    int u;
    int v;
    int w;
    public Edge(int u, int v, int w){
        this.u = u;
        this.v = v;
        this.w = w;
    }
}