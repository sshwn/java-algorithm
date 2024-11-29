package Inhye.Section5_GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_11047 {
    
    public static void main(String[] args) {
        
        int N = 10;   // 동전의 종류 개수
        int K = 4790; // 목표 금액

        int[] coins = {1,5,10,50,100,500,1000,5000,10000,50000};

        Arrays.sort(coins);

        int count = 0; // 필요한 동전 개수

        for (int i=N-1; i>=0; i--) {
            if(coins[i]<=K){
                int num = K / coins[i]; //해당 코인이 몇 개 사용될 수 있는지
                count += num;

                K -= coins[i]*num;
            }

        }

        System.out.println(count); // 최소 동전 개수 출력
    }
}
