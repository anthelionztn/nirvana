package nirvana004;

public class BinarySearch {

	public int bSearch(int[] b,int t){
		int pStart = 0;
		int pStop = b.length-1;
		while(pStart<=pStop){
			int pMid = half(pStart,pStop);
			if(t==b[pMid]){
				return pMid;
			}
			if(t<pMid){
				pStop = pMid;
			} 
			if(t>pMid){
				pStart = pMid;
			}
			pMid = (pStart+pStop)/2;
		}
		return -1;
	}
	public int half(int a, int b){
		return (a+b)/2;
	}
	public void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
class Test2{
	public static void main(String[] args){
		int[] b = {1,2,3,4,5,6,7,8,9};
		BinarySearch s = new BinarySearch();
		//s.print(b);
		System.out.println(s.bSearch(b,1));		
	}
}