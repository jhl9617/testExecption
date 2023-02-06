package com.week4;

import java.util.Arrays;

public class TestWork2 {
    public static void main(String[] args) {
        String st = "J a v a  P r o g r a m ";
        String[] st2 = st.split(" ");
        Object[] chars = Arrays.stream(st2).toArray();
        StringBuilder st3 = new StringBuilder();
        for(int i = 0 ; i < chars.length;i++){
            System.out.print(chars[i]);
            st3.append(chars[i]);

            //st3.append(Character.toUpperCase((Character) chars[i]));
        }
        String result = (String)st3.toString();
        result = result.toUpperCase();
        System.out.println(result);






    }
}
