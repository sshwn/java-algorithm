package Hyeonu.Chapter6;

public class mainClass {
    public static void main(String[] args) {
        P_1_유효한_팰린드롬 p1_유효한_팰린드롬 = new P_1_유효한_팰린드롬();
        String s1 = "Do geese see God";
        System.out.println(p1_유효한_팰린드롬.myTest(s1));
        System.out.println(p1_유효한_팰린드롬.isPalindrome2(s1));
        System.out.println(p1_유효한_팰린드롬.isPalindrome(s1));

        P_2_문자열_뒤집기 p2_문자열_뒤집기 = new P_2_문자열_뒤집기();
        char[] s2 = {'h','e','l','l','o'};
        p2_문자열_뒤집기.myTest(s2);
        p2_문자열_뒤집기.reverseString(s2);

        // 추후 진행
        P_3_로그_파일_재정렬 p3_로그_파일_재정렬 = new P_3_로그_파일_재정렬();

        P_4_가장_흔한_단어 p4_가장_흔한_단어 = new P_4_가장_흔한_단어();
        String paragraph = "Ross hit a ball, the hit BALL flew far away after it was hit";
        String[] banned = {"hit"};
        System.out.println(p4_가장_흔한_단어.myTest(paragraph, banned));

        // 추후 진행
        P_5_그룹_애너그램 p5_그룹_애너그램 = new P_5_그룹_애너그램();

        // 추후 진행
        P_6_가장_긴_팰린드롬_부분_문자열 p6_가장_긴_팰린드롬_부분_문자열 = new P_6_가장_긴_팰린드롬_부분_문자열();
    }
}
