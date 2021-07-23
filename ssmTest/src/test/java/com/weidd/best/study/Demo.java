package com.weidd.best.study;

import org.junit.Test;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-15 21:20
 **/
public class Demo {

    @Test
    public void test1(){
        while(true){
            double d=1.1;
            d++;
            System.out.println(d);
        }


    }

    @Test
    public void test() {

        int a = 3, b = 8;
        // 2
        double c = method(a, b);
        System.out.println(c);
    }

    private double method(int a, int b) {

        for (int i = 1; i < b; i++) {
            int n = 1;
            int m = a;
            while (m != 0) {
                n *= i;
                m--;
            }
            if (n >= b) {
                return (double) i;
            }
        }

        return 0;
    }
}
