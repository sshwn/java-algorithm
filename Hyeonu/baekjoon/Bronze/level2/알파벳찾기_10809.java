package Hyeonu.baekjoon.Bronze.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 알파벳찾기_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashMap<String, Integer> map = new HashMap<>();
        char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf(ch[i]), -1);
        }

        for(int i=0; i<str.length(); i++){
            if(map.get(String.valueOf(str.charAt(i))) == -1) {
                map.put(String.valueOf(str.charAt(i)), i);
            }
        }

        for(int i=0; i<ch.length; i++){
            System.out.print(map.get(String.valueOf(ch[i])) + " ");
        }

    }
}
