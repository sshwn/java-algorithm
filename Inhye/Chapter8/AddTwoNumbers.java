package Inhye.Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 16. 두 수의 덧셈
 * 역순으로 저장된 연결 리스트의 숫자를 더하라.
 * (2->4->3) + (5->6->2)
 * 7->0->6
 * 342+265=607
 */
public class AddTwoNumbers {

    public void reverseList(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,3));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(5,6,2));
		List<Character> result = new ArrayList<>();

		Collections.reverse(list1);
		Collections.reverse(list2);
	
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		for(int i : list1)
			sb1.append(i);

		for(int i : list2)
			sb2.append(i);

		String str1 = sb1.toString();
		String str2 = sb2.toString();

		int num = Integer.parseInt(str1)+Integer.parseInt(str2);    

		String str3 = String.valueOf(num);

		char[] arr = str3.toCharArray();

		for(int i=arr.length-1; 0<=i; i--){
			result.add(arr[i]);
		}

        System.out.println(result.toString());
    }

}
