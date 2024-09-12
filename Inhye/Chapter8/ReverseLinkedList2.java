package Inhye.Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 19. 역순 연결 리스트2
 * 위치 left에서 right까지를 역순으로 만들어라.
 * 위치는 1부터 시작한다.
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6, left=2, right=5
 * 1 -> 5 -> 4 -> 3 -> 2 -> 6 
 */
public class ReverseLinkedList2 {

    public void reverseLinkedList(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		int left=2; int right=5;
		
		List<Integer> result = new ArrayList<>();
		result.add(list.get(0));

		for(int i=right-1; left-1<=i; i--){
			result.add(list.get(i));
		}

		for(int i=right; i<list.size(); i++){
			result.add(list.get(i));
		}

		System.out.println(result.toString());
    }

}
