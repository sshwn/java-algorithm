package Hyeonu.inflearn.doit.section3.homework;

public class P_2_프로그래머스181866 {
    public static void main(String[] args) {
        solution("dxccxbbbxaaaaxxxfff");
    }

    private static String[] solution(String myString) {
        String[] answer = {};
        String[] list = myString.split("\\s+");
        answer = new String[list.length];

        for(int i=0; i<list.length; i++) {
            for(int j=0; j<list.length-i-1; j++) {
                if(list[j].compareTo(list[j+1]) > 0) {
                    String temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        return list;
    }
}
