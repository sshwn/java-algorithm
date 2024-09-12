package Hyeonu.Chapter9;

import java.util.LinkedList;

public class mainClass {
    public static void main(String[] args) {
        P_13_팰린드롬_연결_리스트 p13_팰린드롬_연결_리스트 = new P_13_팰린드롬_연결_리스트();
        // 리스트의 노드들을 생성
        ListNode node5 = new ListNode(1);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        // node1이 리스트의 head가 됨
        ListNode head = node1;

        System.out.println(p13_팰린드롬_연결_리스트.myTest(head));
        System.out.println(p13_팰린드롬_연결_리스트.Runner(head));
    }
}
