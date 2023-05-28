
//Sign of the Product of an Array

import java.util.*;
import java.util.Scanner;
public class leetcode7 {
    public static void arraySign(int[] nums,int size) {
        int p=1,sign;
        for(int i=0;i<size;i++){
            p=p*nums[i];
        }
        //System.out.println(p);
        if(p==0){
             sign=0;
        }else if(p>0){
            sign=1;
        }else{
            sign=-1;
        }
        System.out.println(sign);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int nums[]= new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        arraySign(nums,size);
        //int sign=0;
         
    }
}