package Hyeonu.inflearn.doit.section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class 백준9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int k=0; k<N; k++){
            int a = Integer.parseInt(br.readLine());
            int sum = 0;
            boolean[] A = new boolean[a+1];
            Arrays.fill(A, true);
            A[0] = A[1] = false;  // 0과 1은 소수가 아님

            for(int i=2; i*i<=a; i++){
                if(A[i]) {
                    for (int j = i * i; j <=a; j += i) {
                        A[j] = false;
                    }
                }
            }
            HashMap<String, Integer> map = new HashMap<>();
            int max = a;
            for(int i=2; i<=a; i++) {
                if(A[i]) {

                    // 만약 a - i 가 소수라면
                    if(A[a-i] && max < (a-i) - i) {
                        max = (a-i) - i;
                        map.put("one", i);
                        map.put("two", a-i);
                        if(i+i == a) break;
                    }

                }
            }
            System.out.println(map.get("one") + " " + map.get("two"));
        }
    }
}
