package nirvana013;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	public static void main(String[] args){
		p("abc".matches("..."));
		p("a89279d87b".replaceAll("\\d", "*"));	//“\d”指代数字
		Pattern p1 = Pattern.compile("[a-z]{3}");//p1是编译好的一种模式
		Matcher m1 = p1.matcher("seh");//m1用来储存p1是否匹配的结果，结果可能不唯一
		p(m1.matches());
		p("R".matches("[A-Z&&[RST]]"));//R是否在A-Z中，且是RST三个字母中的一个
		p("a".matches("[^abc]"));//^表示除了abc三个字母的其他值
	}
	public static void p(Object o){
		System.out.println(o);
	}
}
