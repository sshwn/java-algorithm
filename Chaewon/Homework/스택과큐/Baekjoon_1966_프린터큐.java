package Chaewon.Homework.스택과큐;

import java.io.*;
import java.util.*;

public class Baekjoon_1966_프린터큐 {
    public void myAnswer() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        for(int i = 0; i < size; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int totalDocSize = Integer.parseInt(st.nextToken()); // 전체 문서 갯수
            int targetPos = Integer.parseInt(st.nextToken()); // 찾고자 하는 문서의 위치
            int count = 0;

            if(totalDocSize == 1) {
                br.readLine();
                System.out.println(1);
            }
            else {
                st = new StringTokenizer(br.readLine());

                // 큐에 모든 문서의 중요도 넣음
                Queue<Integer> print = new LinkedList<>();
                int targetImportance = 0; // 찾고자 하는 문서의 중요도
                int[] maxArray = new int[totalDocSize];
                for(int j = 0; j < totalDocSize; j++){
                    int temp = Integer.parseInt(st.nextToken());
                    print.offer(temp);
                    maxArray[j] = temp;
                    if(targetPos == j) targetImportance = temp;
                }

                Arrays.sort(maxArray);
                int max = maxArray[totalDocSize - 1];

                while(!(max == targetImportance && targetPos == 0)){
                    int peekDoc = print.peek();
                    if(peekDoc < max){
                        print.poll();
                        print.offer(peekDoc);
                        if(targetPos == 0) targetPos = print.size() - 1;
                        else targetPos -= 1;
                    }else if(peekDoc == max){
                        print.poll();
                        count++;
                        max = maxArray[totalDocSize - 1 - count];
                        targetPos -= 1;
                    }
                }

                System.out.println(count + 1);
            }
        }
    }
}
