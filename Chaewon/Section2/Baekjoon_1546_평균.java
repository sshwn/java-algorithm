package Chaewon.Section2;

import java.io.*;
import java.util.*;

public class Baekjoon_1546_평균 {
    public void myAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] score = new int[size];
        int maxScore = 0;
        for(int i = 0; i < score.length; i++){
            score[i] = Integer.parseInt(st.nextToken());
            if(maxScore < score[i]) maxScore = score[i];
        }

        float totalScore = 0;
        for(int i : score){
            float fakeScore = ((float) i / maxScore) * 100;
            totalScore += fakeScore;
        }

        System.out.println(totalScore / size);
    }

    /**
     * 강의에서 문제 풀이할 땐 식을 정리해서 한번에 처리함
     * A B C  세 점수가 있을 때
     * (A / max * 100) + (B / max * 100) + (C / max * 100) / size
     * => (A + B + C) * 100.0 / max / size
     * 
     * 100.0 으로 작성하면서 자동으로 double 형으로 변환되도록 함
     */
}
