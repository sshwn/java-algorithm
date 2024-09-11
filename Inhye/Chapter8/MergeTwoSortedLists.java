package Inhye.Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 정렬되어 있는 두 연결 리스트를 합쳐라.
 * 1 -> 2 -> 5
 * 1 -> 3 -> 4
 * 1 -> 1 -> 2 -> 3 -> 4 -> 5
 */
public class MergeTwoSortedLists {

    public void mergeTwoSortedLists(){
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,4));
        List<Integer> result = new ArrayList<>();

        for(Integer li : list1){
            result.add(li);
        }

        for(Integer li : list2){
            result.add(li);
        }
        
        Collections.sort(result);

        
        System.out.println(result.toString());
    }

}
