package Chaewon.Homework.소수구하기;
import java.util.*;

public class Baekjoon_9020_골드바흐의추측 {
    public void myAnswer(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int num = sc.nextInt();
            boolean[] isPrime = new boolean[num + 1];

            for(int j = 2; j <= num; j++){
                isPrime[j] = true;
            }

            // 소수 구하기
            for(int j = 2; j * j <= num; j++){
                if(isPrime[j]){
                    for(int z = j * j; z <= num; z+=j){
                        isPrime[z] = false;
                    }
                }
            }

            // 두 수의 차이가 최소가 되어야 해서 임시로 저장해 둠 (두 수와 두 수의 차이)
            int min1 = 0;
            int min2 = 0;
            int minus = num;
            for(int j = 2; j <= num / 2; j++){
                if(isPrime[j] && isPrime[num - j]){
                    if(minus > (num - j) - j) {
                        minus = (num - j) - j;
                        min1 = j;
                        min2 = num - j;
                    }
                }
            }
            System.out.println(min1 + " " + min2);
        }
    }
}
