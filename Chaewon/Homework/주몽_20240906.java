package Chaewon.Homework;
import java.util.ArrayList;
import java.util.List;

public class 주몽_20240906 {
    public int myAnswer(){
        int need = 9;
        int[] materials = {2, 7, 1, 4, 5, 3};
        int answer = 0;

        // 재료 중복 사용 안되니까 한번 쓰고 없애주려고 리스트 선언
        List<Integer> list = new ArrayList<>();
        for(int i : materials) list.add(i);

        for(int i = 0; i < list.size(); i++){
            // need에서 리스트의 0번쨰 값을 뺀 결과값이 존재하면 answer에 1 더하고 두 값 리스트에서 제거
            if(list.contains(need - list.get(0))){
                answer++;
                list.remove(list.indexOf(need - list.get(0)));
                list.remove(list.get(0));
            }else{
                // 존재하지 않으면 현재값만 제거
                list.remove(list.get(0));
            }
        }

        return answer;
    }

    public int myAnswer_twoPointer(){
        int answer = 0;
        int need = 9;
        int[] materials = {2, 7, 4, 1, 5, 3};

        for(int i = 0; i < materials.length; i++){

        }

        return answer;
    }
}
