package Chaewon.Chapter8;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;

public class 두_수의_덧셈 {
    public int myAnswer() {
        Deque<Integer> input1 = new LinkedList<>(Arrays.asList(2, 4, 3)); // 342
        Deque<Integer> input2 = new LinkedList<>(Arrays.asList(5, 6, 2)); // 265

        String input1String = "";
        String input2String = "";

        while(input1.size() > 0) input1String += input1.pollLast() + "";
        while(input2.size() > 0) input2String += input2.pollLast() + "";

        return Integer.valueOf(input1String) + Integer.valueOf(input2String);
    }

    public int myAnswerUseListNode(){
        int[] data1 = {2, 4, 3};
        int[] data2 = {5, 6, 2};

        ListNode<Integer> node1 = new ListNode<>();
        node1 = node1.addIntData(data1);
        ListNode<Integer> node2 = new ListNode<>();
        node2 = node2.addIntData(data2);

        // 두 노드의 값을 역순으로 다시 넣음
        ListNode<Integer> reverseNode1 = null;
        while(node1 != null){
            ListNode<Integer> next = node1.next;
            node1.next = reverseNode1;
            reverseNode1 = node1;
            node1 = next;
        }

        ListNode<Integer> reverseNode2 = null;
        while(node2 != null){
            ListNode<Integer> next = node2.next;
            node2.next = reverseNode2;
            reverseNode2 = node2;
            node2 = next;
        }

        // 역순으로 넣은 값을 꺼내서 int형으로 변환
        String num1 = "";
        while(reverseNode1 != null){
            num1 += String.valueOf(reverseNode1.val);
            reverseNode1 = reverseNode1.next;
        }

        String num2 = "";
        while(reverseNode2 != null){
            num2 += String.valueOf(reverseNode2.val);
            reverseNode2 = reverseNode2.next;
        }

        if("".equals(num1)) num1 = "0";
        if("".equals(num2)) num2 = "0";


        return Integer.valueOf(num1) + Integer.valueOf(num2);
    }
}
