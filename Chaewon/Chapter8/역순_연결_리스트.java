package Chaewon.Chapter8;
import java.util.Deque;
import java.util.LinkedList;

public class 역순_연결_리스트 {
    public String myAnswer(){
        int[] input = {1, 2, 3, 4, 5, 6};
        Deque<Integer> deque = new LinkedList<>();
        String answer = "";

        // 데이터를 데크에 담음
        for(int i : input){
            deque.add(i);
        }

        // 마지막에 들어간 값부터 차례로 꺼냄
        while(deque.size() > 0){
            if(deque.size() == 1) answer += deque.pollLast();
            else answer += deque.pollLast() + " -> ";
        }

        return answer;
    }

    public ListNode<Integer> myAnswerUseListNode(){
        int[] data = {1, 2, 3, 4, 5, 6};
        ListNode<Integer> node = new ListNode<>();
        node = node.addIntData(data);

        ListNode<Integer> temp = null;
        while(node != null){
            ListNode<Integer> next = node.next;
            node.next = temp;
            temp = node;
            node = next;
        }

        return temp;
    }
}
