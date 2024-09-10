package Hyeonu.Chapter9;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 연결 리스트가 팰린드롬(6장 참고) 구조인지 판별하라
 * 입력 : 1-2-3-2-1
 * 출력 : true
 */

public class P_13_팰린드롬_연결_리스트 {

    public boolean myTest(ListNode head) {
        boolean answer = true;
        Stack<Integer> stack = new Stack();

        ListNode node = head;
        while(head != null) {
            stack.add(head.val);
            head = head.next;
        }

        while(!stack.isEmpty()) {
            if(stack.pop() != node.val) {
                answer = false;
            }
            node = node.next;
        }

        return answer;
    }

    public boolean Runner(ListNode head) {
        boolean answer = true;
        ListNode fast = head;
        ListNode slow = head;
        // 1 2 3 2 1
        //     o
        //         o

        // 1 2 3 2 1
        //   o
        //     o
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast != null) {
            slow = slow.next;
        }

        ListNode rev = null;
        while(slow != null) {
            ListNode next = slow.next;
            slow.next = rev;
            rev = slow;
            slow = next;
        }

        while(rev != null) {
            if(rev.val != head.val) {
                return false;
            } else {
                rev = rev.next;
                head = head.next;
            }
        }

        return answer;
    }
}
