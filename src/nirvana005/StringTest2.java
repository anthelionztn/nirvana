package nirvana005;

public class StringTest2 {
	public static void main(String[] args){
		String s = "faer789MJCojlw WE4S =- 9m4tW4T80";
		int lowCase = 0;
		int highCase = 0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c>='a'&&c<='z'){
				lowCase++;
			}
			if(c>='A'&&c<='Z'){
				highCase++;
			}
		}
		System.out.println(lowCase+" "+highCase);

		String s2 = "javannownjavajiojavajiowefjasva";
		String tar = "java";//method 1
		int count = 0;
		int index = -1;
		while((index=s2.indexOf(tar))!=-1){
			s2 = s2.substring(index+tar.length());
			count++;
		}
		System.out.println(count);
		/*
		char d;//method 2
		int cnt = 0;		
		for(int j=0;j<s2.length();j++){
			d = s2.charAt(j);
			if(d=='j'){
				if(s2.charAt(j+1)=='a'){
					if(s2.charAt(j+2)=='v'){
						if(s2.charAt(j+3)=='a'){
							cnt++;
						}else continue;
					}else continue;
				}else continue;
			}else continue;
		}
		System.out.println(cnt);
		*/

	}
}
