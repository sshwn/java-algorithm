package Inhye.Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 17. 페어의 노드 스왑
 * 연결 리스트를 입력 받아 페어 단위로 스왑하라.
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6
 * 2 -> 1 -> 4 -> 3 -> 6 -> 5
 */
public class SwapNodesInPairs {

    public void swapPairs(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		int num=0;
		for(int i=0; i<list.size(); i+=2){
			if(i+1<list.size()){
				num = list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1, num);
			}
		}
		System.out.println(list.toString());
    }


}
