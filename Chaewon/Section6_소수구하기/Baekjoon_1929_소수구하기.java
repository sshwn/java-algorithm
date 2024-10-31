package Chaewon.Section6_소수구하기;

import java.util.*;

public class Baekjoon_1929_소수구하기 {
    public void myAnswer(){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] isPrime = new boolean[N + 1];

        for(int i = 2; i <= N; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i * i <= N; i++){
            if(isPrime[i]){
                // j의 범위가 i * i부터인 이유는 i*i 이하의 숫자는 이전 단계에서 모두 처리됐기 떄문
                for(int j = i * i; j <= N; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = M; i <= N; i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }
    }
}
