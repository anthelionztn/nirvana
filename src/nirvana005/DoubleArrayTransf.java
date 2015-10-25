package nirvana005;

public class DoubleArrayTransf {
	public static void main(String[] args){
		String s = "1,2,3;2,4;5,6,7";
		String[] resFirst = s.split(";");
		double[][] d = new double[resFirst.length][];
		
		for(int i=0;i<resFirst.length;i++){
			String[] resSecond = resFirst[i].split(",");
			d[i] = new double[resSecond.length];
			for(int j=0;j<resSecond.length;j++){
				d[i][j] = Double.parseDouble(resSecond[j]);
			}
			
		}
		
		for(int i=0;i<d.length;i++){
			for(int j=0;j<d[i].length;j++){
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
}