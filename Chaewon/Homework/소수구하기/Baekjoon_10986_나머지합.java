package Chaewon.Homework.소수구하기;
import java.util.*;

public class Baekjoon_10986_나머지합 {
    // 시간초과 남
    public void myAnswer(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] sum = new int[N];
        int count = 0;

        // 구간합
        sum[0] = sc.nextInt();
        for(int i = 1; i < N; i++){
            sum[i] = sum[i-1] + sc.nextInt();
            if(sum[i] % M == 0) count++;
        }

        for(int p1 = 0; p1 < N - 1; p1++){
            for(int p2 = p1 + 1; p2 < N; p2++){
                if((sum[p2] - sum[p1]) % M == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

