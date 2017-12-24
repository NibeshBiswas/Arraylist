package com.test.nibesh;

import java.util.HashMap;

/**
 * Created by nibesh on 4/10/17.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String>stNameMap=new HashMap<>();

        stNameMap.put("13085607","NIBESH");
        stNameMap.put("13045612","MIZAN");


        System.out.println( stNameMap.get("13085607"));

    }
}
