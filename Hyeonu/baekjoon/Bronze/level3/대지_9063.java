package Hyeonu.baekjoon.Bronze.level3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 대지_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 1) {
            System.out.println(0);
        } else {
            int x = Integer.MAX_VALUE;
            int xL = Integer.MIN_VALUE;
            int y = Integer.MAX_VALUE;
            int yL = Integer.MIN_VALUE;
            for(int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if(x > a) {
                    x = a;
                }
                if(y > b) {
                    y = b;
                }
                if(xL < a) {
                    xL = a;
                }
                if(yL < b) {
                    yL = b;
                }
            }

            System.out.println((xL - x) * (yL - y));
        }


    }
}
