package level1;

/**
 * 문제: 최소직사각형
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 완전탐색
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-18
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 */
public class 최소직사각형 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(sol.solution(sizes1)); // 기댓값: 4000

        // 테스트케이스 2
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        System.out.println(sol.solution(sizes2)); // 기댓값: 120

        // 테스트케이스 3
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(sol.solution(sizes3)); // 기댓값: 133
    }

    static class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            return answer;
        }
    }
}
