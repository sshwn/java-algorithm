package Inhye.Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 연결 리스트를 뒤집어라.
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6
 * 6 -> 5 -> 4 -> 3 -> 2 -> 1
 */
public class ReverseLinkedList {

    public void reverse(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //방법1
		List<Integer> result = new ArrayList<>();

		for(int i=list.size()-1; 0<=i; i--){
			result.add(list.get(i));
		}

        System.out.println(result.toString());

        //방법2
        Collections.reverse(result);

        
        System.out.println(result.toString());
    }

}
