package Hyeonu.baekjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 너의평점은_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int totalCnt = 0;
        int avg = 0;

        HashMap<String, Double> map = new HashMap<String, Double>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double sum = 0;
        double sum2 = 0;
        for(int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            double score = Double.parseDouble(st.nextToken().substring(0,1));
            String scoreText = st.nextToken();
            if(!scoreText.equals("P")) {
                sum += score * map.get(scoreText);
//                sum2 += map.get(scoreText);
                sum2 += score;
            }
        }

        System.out.println(sum/sum2);
    }
}
