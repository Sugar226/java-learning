package test;

import java.util.Scanner;
//回文数的解题逻辑为先把输入的整数转为字符串，再将字符串反转就可以比较是否相等
public class testhomenum01 {
       public static  void main (String[] args){
           Scanner scanner=new Scanner(System.in);
           int num=scanner.nextInt();
           String str=String.valueOf(num);//valueOf方法作用就为转为字符串，String自带
           StringBuilder sb=new StringBuilder(str);//StringBuilder就是对字符串进行操作
           //如拼接，插入，反转，删除，反转只有StringBuilder有
           String stu1=sb.reverse().toString();//toString作用为把对象变成字符串
           //因为sb是StringBuilder类，不是String类
           if(str.equals(stu1)){
               System.out.println(true);
           }
           else{
               System.out.println(true);
           }
       }
}
