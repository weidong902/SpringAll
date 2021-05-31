package com.weidd.best.study.test;

import java.util.HashMap;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-17 15:28
 **/
public class Tests {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <1000; i++) {
            map.put(i, i);
        }

    }
}
