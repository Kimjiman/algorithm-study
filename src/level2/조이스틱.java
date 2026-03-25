package level2;

import java.util.Arrays;

/**
 * 문제: 조이스틱
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42860
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 탐욕법
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-19
 *
 * [풀이 접근 방식 — Claude가 풀이 완료 후 작성]
 */
public class 조이스틱 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("JAZ")); // 기댓값: 11
        System.out.println(sol.solution("JEROEN")); // 기댓값: 56
        System.out.println(sol.solution("JAN"));    // 기댓값: 23
    }

    static class Solution {
        public int solution(String name) {
            // ABCDEFGHIJKLM
            // NOPQRSTUVWXYZ
            int[] nameCntArr = new int[name.length()];

            for(int i = 0; i < nameCntArr.length; i++) {
                nameCntArr[i] = ('M' - name.charAt(i) < 0) ? 'Z' - name.charAt(i) + 1 : name.charAt(i) - 'A';
            }

            System.out.println(Arrays.toString(nameCntArr));
            while(true) {
                

                break;
            }

            int answer = 0;
            return answer;
        }
    }
}
