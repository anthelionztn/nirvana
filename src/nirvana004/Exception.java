package nirvana004;

public class Exception {
	public static void main(String[] args){
		int [] arr = {1,2,3};
		
		try{
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("System error, please cantact with administrator");
			e.printStackTrace();//打印出错误的堆栈信息
		}
	}
}
