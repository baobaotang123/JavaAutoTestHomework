package com.cloris.day3;

import java.util.HashMap;
import java.util.Scanner;

/*
计算从键盘输入的字符串中各个字母出现的次数
 */

public class Topic1 {

    public static void main(String[] args) {

//        String str1 = "abcdefghijklm";
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要统计的字符串：");


        String str = scan.nextLine();


        char[] arr = str.toCharArray();


        HashMap<Character,Integer> hm = new HashMap<>();
        for(char a:arr){

            hm.put(a, !hm.containsKey(a)?1:hm.get(a)+1);

        }
        for (Character key : hm.keySet()) {             //hm.keySet()代表所有键的集合
            System.out.println(key + "=" + hm.get(key));//hm.get(key)根据键获取值
        }


    }
}
