package Hyeonu.baekjoon.Bronze.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 나머지_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<10; i++) {
            int N = Integer.parseInt(br.readLine());
            map.put(N % 42, map.getOrDefault(N % 42, 0) + 1);
        }
        System.out.println(map.size());
    }
}
