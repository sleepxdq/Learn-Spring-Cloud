package com.xdq.base;

import org.junit.Test;

/**
 * @Auther Dongqiang
 * @Date 2017/11/30 12:00
 */
public class Demo {

    @Test
    public void test1(){
        System.out.println(4&5);
    }

    @Test
    public void test2(){
        for (int i = 1000; i < 10000; i++) {
            //偶数
//            if (0 == (i&1)){
                //求吸血鬼数字
                String numStr = i + "";
                int count = 0;
                boolean flag = false;
                char[] chars = numStr.toCharArray();
                for (char c : chars){
                    if (c == '0'){
                        count++;
                    }
                    if (count >= 2) {
                        flag = false;
                        break;
                    }
                    flag = true;
                }
                if (flag) {
                    int n1 = chars[0] - '0';
                    int n2 = chars[1] - '0';
                    int n3 = chars[2] - '0';
                    int n4 = chars[3] - '0';
                    if (0 != getNum(i, n1, n2, n3, n4)){
                        System.out.println(i);
                        continue;
                    }
                    if (0 != getNum(i, n1, n3, n2, n4)){
                        System.out.println(i);
                        continue;
                    }
                    if (0 != getNum(i, n1, n4, n3, n2)){
                        System.out.println(i);
                    }
                }

//            }
        }
    }

    private int getNum(int i, int n1, int n2, int n3, int n4) {
        if ((n1*10+n2)*(n3*10+n4) == i){
            return i;
        }
        if ((n1*10+n2)*(n3+n4*10) == i){
            return i;
        }

        if ((n1+n2*10)*(n3*10+n4) == i){
            return i;
        }
        if ((n1+n2*10)*(n3+n4*10) == i){
            return i;
        }
        return 0;
    }

    @Test
    public void test3(){
        for (int i = 11; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                int num = i*j;
                if (num<1000 || num>10000)
                    continue;
                String[] numStr = String.valueOf(num).split("");
            }
        }
    }

}
