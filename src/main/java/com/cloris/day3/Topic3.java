package com.cloris.day3;



import lombok.extern.java.Log;

import java.util.*;

@Log
public class Topic3 {

    public static void main(String[] args) {
        Map<String, User> userMap = Topic2.getUserMap();
        String group1 = "青年";
        String group2 = "中年";
        String group3 = "老年";

        Map<String, List<User>> groupMap = new HashMap<>();
        groupMap.put(group1, new ArrayList<User>());
        groupMap.put(group2, new ArrayList<User>());
        groupMap.put(group3, new ArrayList<User>());

        //分组
        String group = "";
        for(Map.Entry<String, User> entry : userMap.entrySet()){
            if(entry.getValue().getAge() < 20){
                group = group1;
            }else if(entry.getValue().getAge() < 30){
                group = group2;
            }else{
                group = group3;
            }
            groupMap.get(group).add(entry.getValue());
        }

        log.info(groupMap.toString());

        //遍历
        for(Map.Entry<String, List<User>> entry : groupMap.entrySet()){
            log.info("分组: " + entry.getKey());
            for(User user : entry.getValue()){
                log.info("user: " + user);
            }
        }

    }
}
