package level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제: 카펫
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42842
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 완전탐색
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-19
 *
 * [풀이 접근 방식 — Claude가 풀이 완료 후 작성]
 */
public class 카펫 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(java.util.Arrays.toString(sol.solution(10, 2)));  // 기댓값: [4, 3]
        System.out.println(java.util.Arrays.toString(sol.solution(8, 1)));   // 기댓값: [3, 3]
        System.out.println(java.util.Arrays.toString(sol.solution(24, 24))); // 기댓값: [8, 6]
        System.out.println(java.util.Arrays.toString(sol.solution(12, 3))); // 기댓값: [5, 3]
    }

    static class Solution {
        public int[] solution(int brown, int yellow) {
            int max = Math.max(brown, yellow);
            int min = Math.min(brown, yellow);

            for(int i = 0; i < min; i++) {

            }

            int[] answer = {};
            return answer;
        }
    }
}
