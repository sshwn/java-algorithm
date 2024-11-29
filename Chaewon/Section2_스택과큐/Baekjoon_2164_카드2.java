package Chaewon.Section2_스택과큐;
import java.util.*;

public class Baekjoon_2164_카드2 {
    public void myAnswer() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= size; i++){
            // add()는 값 삽입에 실패 했을 떄 오류를 발생 시킴 (IllegalStateException)
            // -> false를 리턴하는 offer()가 더 나음
            queue.add(i);
        }

        while(queue.size() > 1){
            queue.poll();

            // poll()은 값이 없는 경우에 오류를 발생 시킴 (NoSuchElementException)
            // -> null을 리턴하는 remove()가 더 나음
            int temp = queue.poll();
            queue.add(temp);
        }

        System.out.print(queue.peek());
    }
}
