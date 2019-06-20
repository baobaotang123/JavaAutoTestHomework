package com.cloris.day3;

/*
计算从键盘输入的字符串中各个字母出现的次数
 */

import java.util.HashMap;

public class Topic2 {

    public static void main(String[] args) {

        String str1 = "abcdefghijklm";

        char[] arr = str1.toCharArray();


        HashMap<Character,Integer> hm = new HashMap<>();
        for(char a:arr){

            hm.put(a, !hm.containsKey(a)?1:hm.get(a)+1);

        }
        for (Character key : hm.keySet()) {             //hm.keySet()代表所有键的集合
            System.out.println(key + "=" + hm.get(key));//hm.get(key)根据键获取值
        }


    }
}
