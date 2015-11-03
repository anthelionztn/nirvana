package algorithm;
/*10个学生考完期末考试评卷完成后，A老师需要划出及格线，要求如下：
(1) 及格线是10的倍数；
(2) 保证至少有60%的学生及格；
(3) 如果所有的学生都高于60分，则及格线为60分
*/
public class PassLevel {
	public static void main(String[] args){
		int rl;
		int[] arr = {45,74,27,87,58,98,33,77,25,98};
		QuickSortArr a = new QuickSortArr(arr);
		a.qs(0, a.arr.length-1);
		for(int i=0;i<a.arr.length;i++){
			System.out.print(a.arr[i]+" ");
		}
		System.out.println();
		if(a.arr[0]>=60){
			rl = 60;
		}else if(a.arr[4]%10==0){
			rl = a.arr[4];
		}else{
			rl = (a.arr[4]/10)*10;
		}
		System.out.println("result: "+rl);
		
	}
}
class QuickSortArr{
	int[] arr;
	public QuickSortArr(int[] arr){
		this.arr = arr;
	}
	public void qs(int left, int right){
		int i,j,t,tmp;
		int cnt = 1;
		if(left>right){
			return;
		}
		tmp = arr[left];	//tmp中存的是基准数
		i = left;
		j = right;	//left和right是那两个哨兵
		while(i!=j){
			while(arr[j]>=tmp&&i<j){
				j--;
			}	//先从右向左找
			while(arr[i]<=tmp&&i<j){
				i++;
			}	//再从左向右找
			if(i<j){	//当两个哨兵还没相遇时
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}	//交换ij两个数的位置
		}
		arr[left] = arr[i];
		arr[i] = tmp;	//基准数归位
		System.out.println(cnt++);
		qs(left,i-1);	//继续处理左边的
		qs(i+1,right);	//继续处理右边的	
	}
}