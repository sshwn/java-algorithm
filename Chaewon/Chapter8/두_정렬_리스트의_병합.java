package Chaewon.Chapter8;
import java.util.LinkedList;
import java.util.Collections;

public class 두_정렬_리스트의_병합 {
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

    /**
     * 책 - 재귀함수로 풀이
     * @return
     */
    public ListNode<Integer> useRecursive(){
        ListNode<Integer> node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(5);

        ListNode<Integer> node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);

        // 두 노드 중 널이 아닌 노드를 리턴
        if(node1 == null) return node2;
        if(node2 == null) return node1;
        
        // 1 , 1 들어오면
        if(node1.val > node2.val){
//            node2.next = useRecursive(node1.next, node2);
            return node2;
        }else { // 여기 동작하고 useResursive(1, 3) 이 동작하는 동시에 1 출력
//            node1.next = useRecursive(node1, node2.next);
            return node1;
        }
    }
}
