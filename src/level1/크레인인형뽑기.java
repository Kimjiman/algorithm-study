package level1;

/**
 * 문제: 크레인 인형뽑기 게임
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/64061
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 스택 + 시뮬레이션
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-18
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 */
public class 크레인인형뽑기 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[][] board = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(sol.solution(board, moves)); // 기댓값: 4
    }

    static class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            return answer;
        }
    }
}
