package com.cloris.day3;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/*
定义一个Map,key是userId，value是User，要求遍历整个map数据
User{String userid,String name,int age,Map<String,List<String>>hobby}


 */
@Setter
@Getter
@ToString
@Log
public class Topic3 extends Object {

    private String userId,userName;
    private Integer age;

    private Map<String,List<String>> hobby;

    public Topic3(int age,String userId,String userName,Map<String,List<String>> hobby){
        this.age = age;
        this.userId = userId;
        this.userName = userName;
        this.hobby = hobby;

    }



    public static void main(String[] args) {

        HashMap<String,List<String>> hobby1 = new HashMap<>();
        List<String> firstUserHobbyList = new ArrayList<>(Arrays.asList("文学","艺术","科幻"));
        hobby1.put("电影",firstUserHobbyList);
        Topic3 firstUser = new Topic3(28,"001","张三",hobby1);
        log.info(firstUser.toString());

    }



}
