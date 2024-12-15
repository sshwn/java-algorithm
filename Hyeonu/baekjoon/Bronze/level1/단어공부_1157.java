package Hyeonu.baekjoon.Bronze.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            map.put(String.valueOf(str.charAt(i)).toUpperCase(), map.getOrDefault(String.valueOf(str.charAt(i)).toUpperCase(), 0) + 1);
        }

        int max = 0;
        String result = "";
        boolean flag = false;
        Set<String> keys = map.keySet();
        for(String k : keys) {
            if(map.get(k) >= max) {
                flag = map.get(k) == max ? true : false;
                max = map.get(k);
                result = k;


            }
        }


        System.out.println(flag ? "?" : result);

    }
}
