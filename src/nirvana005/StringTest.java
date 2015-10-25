package nirvana005;

public class StringTest {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);
        String s3 = new String("world");
        String s4 = new String("world");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        //System.out.println("hello world");
        int i = 100;
        String[] str;
        str = s3.split("r");
        System.out.println(str[0]+str[1]);
        String s5 = String.valueOf(i);
        System.out.println(s5.length());
    }
}
