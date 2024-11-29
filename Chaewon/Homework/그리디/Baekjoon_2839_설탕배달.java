package Chaewon.Homework.그리디;
import java.util.*;

public class Baekjoon_2839_설탕배달 {
    public void myAnswer(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        while(N > 0){
            if(N % 5 == 0){
                result += N / 5;
                break;
            }else{
                N -= 3;
                result++;
            }
        }

        if(N < 0){
            System.out.println(-1);
        }else{
            System.out.println(result);
        }
    }
}
