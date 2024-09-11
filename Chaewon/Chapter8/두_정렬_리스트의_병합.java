package Chaewon.Chapter8;
import java.util.LinkedList;
import java.util.Collections;

public class 두_정렬_리스트의_병합 {
    public ListNode<Integer> myAnswerUseListNode(){
        int[] data1 = {1, 2, 5};
        ListNode<Integer> node1 = new ListNode<>();
        node1 = node1.addIntData(data1);

        int[] data2 = {1, 3, 4};
        ListNode<Integer> node2 = new ListNode<>();
        node2 = node2.addIntData(data2);

        ListNode<Integer> answer = new ListNode<>();

        this.recursive(node1, node2);
        return node2;
    }

    public ListNode<Integer> recursive(ListNode<Integer> node1, ListNode<Integer> node2){
        if(node1 == null) return node2;
        if(node2 == null) return node1;

        if(node1.val > node2.val){
            node2.next = recursive(node1, node2.next);
            return node2;
        }else{
            node1.next = recursive(node1.next, node2);
            return node1;
        }
    }

    public LinkedList myAnswer(){
        LinkedList<Integer> input1 = new LinkedList<>();
        input1.add(1);
        input1.add(2);
        input1.add(5);

        LinkedList<Integer> input2 = new LinkedList<>();
        input2.add(1);
        input2.add(3);
        input2.add(4);

        // 두 연결리스트를 합쳐서 sort
        input1.addAll(input2);
        Collections.sort(input1);

        return input1;
    }
}
