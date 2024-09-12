package Inhye.Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 연결 리스트가 팰린드롬 구조인지 판별하라.
 * 1 -> 2 -> 3 -> 2 -> 1
 * true
 */
public class PalindromeLinkedList {

    public void isPalindrome(){
        boolean result=true;

		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,2,1));

		int head=0;
        int tail=list2.size()-1;

		while(head<tail){
			if(list2.get(head)==list2.get(tail)){
				head++;
                tail--;
            }else{
                result=false;
            }
		}
     
        System.out.println(result);
    }

    
    

}
