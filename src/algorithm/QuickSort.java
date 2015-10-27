package algorithm;
import java.util.*;
public class QuickSort {
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList();
		for(int i=0;i<10;i++){
			arr.add(i);
			Collections.shuffle(arr);
		}
		System.out.println(arr);
		System.out.println(qS(arr,0,9));
	}
	public static ArrayList<Integer> qS(ArrayList<Integer> arr, int left, int right){
		int i,j,baseNum,tmp;
		i = left;
		j = right;
		baseNum = arr.get(left);
		if(i>j){
			System.out.println("Error input");
		}
		while(i!=j){
			while(arr.get(j)>=baseNum && j>i){
				j--;
			}
			while(arr.get(i)<=baseNum && j>i){
				i++;
			}
			tmp = arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, tmp);//交换i,j位置元素
		}
		arr.set(left, arr.get(i));
		arr.set(i, baseNum);//交换基准数字
		
		ArrayList<Integer> newListLeft = new ArrayList();
		ArrayList<Integer> newListRight = new ArrayList();
		newListLeft.addAll(arr.subList(left, i-1));
		newListRight.addAll(arr.subList(i+1, right));
		ArrayList<Integer> listSorted = new ArrayList();
		listSorted.addAll(qS(newListLeft,left,i-1));
		listSorted.add(baseNum);
		listSorted.addAll(qS(newListRight,i+1,right));
		return listSorted;
	}
}

