package Hyeonu.baekjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;

public class 그룹단어_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 1; i <= N; i++) {
            String str = br.readLine();
            if(str.length() == 1) {
                cnt++;
            } else {
                HashMap<String, Integer> map = new HashMap<>();
                String flag = "";
                boolean flag2 = true;
                for(int j = 0; j < str.length(); j++) {
                    if(j >= 1) {
                        flag = String.valueOf(str.charAt(j-1));  //이전 데이터를 담는다.
                        if (!String.valueOf(str.charAt(j)).equals(flag)) {   // abbc 일때 a와b가 다를경우
                            if (map.get(String.valueOf(str.charAt(j))) != null) {
                                flag2 = false;
                            }
                        }
                    }
                    map.put(String.valueOf(str.charAt(j)), 1);
                }
                if(flag2) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
