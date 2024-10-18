package Chaewon.Homework.정렬;
import java.util.*;

public class 프로그래머스_문자열잘라서정렬하기 {
    public String[] myAnswer (String myString) {
        List<String> answerList = new ArrayList<>();

        // 입력받은 string 값을 x를 기준으로 분할해서 배열에 담음
        String temp = "";
        char[] tempArr = myString.toCharArray();
        for(int i = 0; i < tempArr.length; i++){
            if(tempArr[i] != 'x'){
                temp += tempArr[i] + "";
            }else if(!temp.equals("")){
                answerList.add(temp);
                temp = ""; // 배열에 넣었으니까 다시 초기화
            }
        }

        if(!temp.equals("")){
            answerList.add(temp);
        }

        String[] answer = answerList.toArray(new String[answerList.size()]);

        // compareTo 사용해서 음수, 0, 양수 에 따라서 정렬
        for(int i = 0; i < answer.length - 1; i++){
            for(int j = i + 1; j < answer.length; j++){
                int comp = answer[i].compareTo(answer[j]);
                if(comp >= 1){
                    String tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
        }

        return answer;
    }
}
