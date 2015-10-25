package nirvana004;

public class TestArray {
	public static void main(String[] args){
		int [] a;
		a = new int [] {1,7,3,3,5,2};
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		SortTong tong = new SortTong();
		tong.sort(a);
		SortSelection s = new SortSelection();
		s.sort(a);
	}
}
class SortTong{
	public void sort(int[] a){
		int[] tong = new int[10];
		for(int i = 0;i<tong.length;i++){
			tong[i] = 0;
		}
		for(int i = 0;i<a.length;i++){
			tong[a[i]]++;
		}
		for(int j = 0;j<tong.length;j++){
			if(tong[j]==0)  continue;
			for(int k = 1;k<=tong[j];k++){
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
}
class SortSelection{
	public void sort(int[] a){
		int temp,k;
		for(int i=0;i<a.length;i++){
			k = i;//保存目前最小值的坐标为k
			for(int j=k+1;j<a.length;j++){
				if(a[k]>a[j]){
					k = j;
				}
			}//这个循环之后k中保存了此轮中最小数的坐标
			if(k!=i){
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}//如果k值和最开始的i不同，则需要交换，否则不需要
		}
		for(k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
		System.out.println();
	}
}