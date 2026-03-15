package test;

import java.util.Scanner;

public class RomanNum {//罗马文
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int sum=0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);//转换为单字字母
            int num1=getValue(c);
            if(i<num.length()-1&&num1<getValue(num.charAt(i+1))) {
                //如果下标小于字符串的长度减一，就是后面没有字母了
                //或者字母小于右边的字母
                sum-=num1;
            }
            else{
                sum+=num1;
            }
        }
        System.out.println(sum);
    }

        public static int getValue(char c){
            switch(c){
                case 'I': return 1;
                case 'V':return 5;
                case 'X':return 10;
                case 'L':return 50;
                case 'C':return 100;
                case 'D':return 500;
                case 'M':return 1000;
                default:return 0;
            }
        }
}
