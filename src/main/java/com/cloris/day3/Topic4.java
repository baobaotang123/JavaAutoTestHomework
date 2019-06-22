package com.cloris.day3;


import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log
public class Topic4 {

    public static void main(String[] args) {
        Map<String, User> userMap = Topic2.getUserMap();
        String group1 = "文学";
        String group2 = "电影";

        Map<String, List<User>> groupMap = new HashMap<>();
        groupMap.put(group1, new ArrayList<User>());
        groupMap.put(group2, new ArrayList<User>());

        //分组
        String group = "";
        for(Map.Entry<String, User> entry : userMap.entrySet()){
            if(entry.getValue().getHobby().containsKey(group1)){ //文学
                groupMap.get(group1).add(entry.getValue());
            }
            if(entry.getValue().getHobby().containsKey(group2)){ //电影
                groupMap.get(group2).add(entry.getValue());
            }
        }

        log.info(groupMap.toString());

    }
}
