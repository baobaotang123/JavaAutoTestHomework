package com.cloris.day3;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;

import java.util.*;

/*
定义一个Map,key是userId，value是User，要求遍历整个map数据
User{String userid,String name,int age,Map<String,List<String>>hobby}


 */
@Setter
@Getter
@ToString
@Log
public class User {

    private String userId,userName;
    private Integer age;

    private Map<String,List<String>> hobby;

    public User(String userId, int age, String userName, Map<String,List<String>> hobby){
        this.age = age;
        this.userId = userId;
        this.userName = userName;
        this.hobby = hobby;

    }







}
