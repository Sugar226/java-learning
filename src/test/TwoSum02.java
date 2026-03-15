package test;

import java.util.Scanner;

public class TwoSum02 {
    public static  void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []num={3,4,5,7,8};
        int target=scanner.nextInt();
        for(int i=0;i< num.length;i++){
            for(int j=i+1;j< num.length;j++){
                if(num[i]+num[j]==target){
                    System.out.println(i+"   "+j);
                }
            }
        }
    }

}
