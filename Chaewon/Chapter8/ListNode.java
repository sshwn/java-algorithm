package Chaewon.Chapter8;

public class ListNode<E> {
    public E val;
    public ListNode<E> next;

    public ListNode() {}

    public ListNode(E value){
        this.val = value;
    }

    public ListNode(E value, ListNode<E> next){
        this.val = value;
        this.next = next;
    }

    /**
     * int 배열로 받은 문제의 input 데이터를 ListNode에 넣음
     * @param input
     * @return
     */
    public ListNode<Integer> addIntData(int[] input){
        ListNode<Integer> head = new ListNode(0);
        ListNode<Integer> last = head;
        for(int i = 0; i < input.length; i++){
            last.next = new ListNode(input[i]);
            last = last.next;
        }
        return head.next;
    }

    public String toString(ListNode<E> node1){
        String s = "";
        while(node1.next != null){
            s += node1.val + " -> ";
            node1 = node1.next;
        }

        // 마지막 하나는 화살표 없이 출력
        s += node1.val + "";
        return s;
    }
}
