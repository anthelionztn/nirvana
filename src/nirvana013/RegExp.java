package nirvana013;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	public static void main(String[] args){
		p("abc".matches("..."));
		p("a89279d87b".replaceAll("\\d", "*"));	//��\d��ָ������
		Pattern p1 = Pattern.compile("[a-z]{3}");//p1�Ǳ���õ�һ��ģʽ
		Matcher m1 = p1.matcher("seh");//m1��������p1�Ƿ�ƥ��Ľ����������ܲ�Ψһ
		p(m1.matches());
		p("R".matches("[A-Z&&[RST]]"));//R�Ƿ���A-Z�У�����RST������ĸ�е�һ��
		p("a".matches("[^abc]"));//^��ʾ����abc������ĸ������ֵ
	}
	public static void p(Object o){
		System.out.println(o);
	}
}
