package level1;

/**
 * 문제: 모의고사
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 완전탐색
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-17
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 */
public class 모의고사 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[] answers1 = {1, 2, 3, 4, 5};
        System.out.println(java.util.Arrays.toString(sol.solution(answers1))); // 기댓값: [1]

        // 테스트케이스 2
        int[] answers2 = {1, 3, 2, 4, 2};
        System.out.println(java.util.Arrays.toString(sol.solution(answers2))); // 기댓값: [1, 2, 3]
    }

    static class Solution {
        public int[] solution(int[] answers) {
            int[] result = {};
            return result;
        }
    }
}
