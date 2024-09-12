package Chaewon.Chapter8;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class 페어의_노드_스왑 {
    public void myAnswer() {
        Deque<Integer> input = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int originInputSize = input.size();
        Deque<Integer> answer = new LinkedList<>();

        while(input.size() > 1){
            int tmp = 0;
            tmp = input.pollFirst();
            answer.add(input.pollFirst());
            answer.add(tmp);
        }

        if(input.size() == 1) answer.add(input.pollFirst());

        System.out.println(answer.toString());
    }

}
