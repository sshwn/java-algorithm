package Inhye.Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 홀짝 연결 리스트
 * 연결 리스트를 홀수 번째 노드 다음에 짝수번째 노드가 오도록 재구성하라.
 * 공간 복잡도 O(1), 시간 복잡도 O(n)에 풀이하라.
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6
 * 1 -> 3 -> 5 -> 2 -> 4 -> 6
 */
public class OddEvenLinkedList {

    public void oddEvenList(){
        
        //공간복잡도 O(n)
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //공간복잡도 O(n)
		List<Integer> result = new ArrayList<>();

        //시간복잡도 O(n)
		for(int i=0; i<list.size(); i+=2){
			result.add(list.get(i));
		}

        //시간복잡도 O(n)
		for(int i=1; i<list.size(); i+=2){
			result.add(list.get(i));
		}

        //시간복잡도 = O(n)+O(n) = O(n)
        //공간복잡도 = O(n)+O(n) = O(n)


        /* 공간복잡도를 O(1)으로 만들기 */
        int n = list.size();
        if (n <= 1) {
            // No need to rearrange if the list has 0 or 1 elements
            return;
        }

        // Rearranging in place without extra space
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        int evenIndex = 0;
        int oddIndex = (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                list.set(evenIndex++, arr[i]);
            } else {
                list.set(oddIndex++, arr[i]);
            }
        }
		
		System.out.println(result.toString());
    }

}
