package nirvana004;

public class Array2D {
	public static void main(String[] args){
		int[][] a = {{1,2},{1,2,3},{2}};
		//printArray2D(a);
		int[][] b = new int[2][3];
		printArray2D(b);
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				b[i][j] = 2;
			}
		}
		printArray2D(b);
		
		/*----------------------------*/
		int[][] s1 = {{1,2,3},{3,2,1}};
		int[][] s2 = new int[2][3];
		System.arraycopy(s1, 0, s2, 0, s1.length);
		s2[1][1] = 11;
		printArray2D(s1);
		
	}
	public static void printArray2D(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
