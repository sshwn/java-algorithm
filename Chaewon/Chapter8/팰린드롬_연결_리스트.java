package Chaewon.Chapter8;

import java.util.Deque;
import java.util.Stack;
import java.util.LinkedList;

public class 팰린드롬_연결_리스트 {
    public boolean myAnswer(){
        int[] input = new int[]{1, 2, 3, 2, 1};
        Deque<Integer> deque = new LinkedList<>();
        for(int i : input){
            deque.add(i);
        }

        while(deque.size() > 1){
            if(deque.pollFirst() != deque.pollLast())
                return false;
        }
        return true;
    }

    /**
     * 책 - 스택을 이용한 풀이
     * @return
     */
    public boolean useStack(){
        ListNode<Integer> head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        Stack<Integer> stack = new Stack();
        ListNode<Integer> node = head;
        while(node != null){
            stack.add(node.val);
            node = node.next;
        }

        while(head != null){
            if(head.val != stack.pop()){ // 이 부분 이해 안 됨 무조건 같지 않나 내가 head를 잘못 설정한건지
                return false;
            }

            head = head.next;
        }
        return true;
    }

    /**
     * 책 - 데크를 이용한 풀이
     * @return
     */
    public boolean useDeque(){
        ListNode<Integer> head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);

        Deque<Integer> deque = new LinkedList<>();
        while(head != null){
            deque.add(head.val);
            head = head.next;
        }

        while(deque.size() > 1){
            if(deque.pollFirst() != deque.pollLast()){
                return false;
            }
        }

        return true;
    }

    public boolean useRunner() {

        return true;
    }
}
