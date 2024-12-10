package Hyeonu.baekjoon.Bronze.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 다이얼_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        HashMap<Character, Integer> map = new HashMap<>();
        int cnt = 0;
        int key = 2;

        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], key);
            cnt++;
            if (key == 7 || key == 9) {
                // 'PQRS'와 'WXYZ'는 4개의 문자를 가지므로, 4번 후에 다음 키로 넘어갑니다
                if (cnt % 4 == 0) key++;
            } else {
                // 다른 키들은 3개의 문자를 가지므로, 3번 후에 다음 키로 넘어갑니다
                if (cnt % 3 == 0) key++;
            }
        }

        String str = br.readLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += map.get(str.charAt(i)) + 1; // 다이얼을 돌리는 시간은 키 값에 1을 더한 값
        }
        System.out.println(result);
    }
}
