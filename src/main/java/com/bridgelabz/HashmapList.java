package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class HashmapList {
    public static void main(String[] args) {
        System.out.println("Welcom to HAshMapxample");
        HashMap<Integer,String> map =new HashMap<Integer,String>();
        map.put(1,"swati");
        map.put(2,"kalyani");
        map.put(3,"Smitha");
        map.put(4,"Raj");
        map.put(5,"Kunal");
        map.put(7,"yogesh");
        map.put(8,"Dhanshree");
        map.put(9,"apple");
        System.out.println("Iterating Hashmap....");
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+"."+m.getValue());
        }
        //Adding element in Hash map &travesing
        map.putIfAbsent(6,"Akshar");
        System.out.println("After invoking putIfAbsent() method");
        for(Map.Entry m:map.entrySet()){
            System.out.println(""+m.getValue());
        }
        //removing element in the hash map
        System.out.println("Hash list of elements"+map);
        map.remove(9,"apple");
        System.out.println("Updated list"+map);
        //replace elements in the Hash map
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.replace(1,"swati","swati badole");
        System.out.println("After replace list of elements :"+map);

    }
}
