package nirvana004;

public class SortBubble {//冒泡排序
	public void sort(Date[] days){
		Date temp = new Date(0,0,0);
		for(int i=0;i<days.length-1;i++){
			for(int j=0;j<days.length-1;j++){
				if(days[j].compare(days[j+1])==1){//等价于if(days[j]>days[j+1])
					temp = days[j+1];
					days[j+1] = days[j];
					days[j] = temp;
				}
			}
		}
	}
}
class Date{
	int year, month, day;
	Date(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int compare(Date d){
		if(this.year>d.year){
			return 1;
		}else if(this.year<d.year){
			return -1;
		}else{
			if(this.month>d.month){
				return 1;
			}else if(this.month<d.month){
				return -1;
			}else{
				if(this.day>d.day){
					return 1;
				}else if(this.day<d.day){
					return -1;
				}else{
					return 0;
				}
			}
		}
		/*return this.year<d.year? -1:this.year>d.year? 1
				:this.month<d.month? -1
				:this.month>d.month? 1
				:this.day<d.day? -1
				:this.day>d.day? 1:0; //传入的日期大，则返回-1*/
	}
	public void print(){
		System.out.println(this.year+"/"+this.month+"/"+this.day);
	}
}
class Test{
	public static void main(String[] args){
		Date[] d = new Date[4];
		d[0] = new Date(2002,11,12);
		d[1] = new Date(2002,11,14);
		d[2] = new Date(1992,12,14);
		d[3] = new Date(1990,12,14);
		SortBubble s = new SortBubble();
		s.sort(d);
		for(int i=0;i<d.length;i++){
			d[i].print();
			System.out.println();
		}
	}
}