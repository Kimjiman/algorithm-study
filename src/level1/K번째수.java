package level1;

import java.util.Arrays;

/**
 * 문제: K번째수
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 정렬
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-18
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 */
public class K번째수 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[] array1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(sol.solution(array1, commands1))); // 기댓값: [5, 6, 3]
    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            return answer;
        }
    }
}
