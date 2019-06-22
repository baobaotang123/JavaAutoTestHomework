package com.cloris.day3;



import lombok.extern.java.Log;

import java.util.*;

@Log
public class Topic2 {

    public static void main(String[] args) {
        log.info(getUserMap().toString());
    }


    public static Map<String, User> getUserMap(){
        Map<String, User> userMap = new HashMap<>();

        HashMap<String,List<String>> hobby1 = new HashMap<>();
        hobby1.put("文学", new ArrayList<>(Arrays.asList("金瓶梅","春闺秘史","如何重整男人雄风")));
        hobby1.put("电影", new ArrayList<>(Arrays.asList("岛国动作模仿秀","慈禧的后宫秘史")));
        User user1 = new User("u001", 48,"大叔",hobby1);
        userMap.put(user1.getUserId(), user1);
        log.info(user1.toString());

        HashMap<String,List<String>> hobby2 = new HashMap<>();
        hobby2.put("文学", new ArrayList<>(Arrays.asList("三国演义","水浒传")));
        hobby2.put("运动", new ArrayList<>(Arrays.asList("足球","篮球")));
        User user2 = new User("u002", 28,"小伙",hobby2);
        userMap.put(user2.getUserId(), user2);
        log.info(user2.toString());

        HashMap<String,List<String>> hobby3 = new HashMap<>();
        hobby3.put("文学", new ArrayList<>(Arrays.asList("红楼梦","西游记")));
        hobby3.put("运动", new ArrayList<>(Arrays.asList("足球","羽毛球")));
        User user3 = new User("u003", 17,"小青年",hobby3);
        userMap.put(user3.getUserId(), user3);
        log.info(user3.toString());

        HashMap<String,List<String>> hobby4 = new HashMap<>();
        hobby4.put("文学", new ArrayList<>(Arrays.asList("知音")));
        hobby4.put("电影", new ArrayList<>(Arrays.asList("复仇者联盟","肖申克的救赎")));
        User user4 = new User("u004", 35,"老王",hobby4);
        userMap.put(user4.getUserId(), user4);
        log.info(user4.toString());

        return userMap;
    }
}
