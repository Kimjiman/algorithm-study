package level1;

/**
 * 문제: 최소직사각형
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 탐욕법
 * 시간복잡도: O(N)
 * 공간복잡도: O(1)
 * 풀이 날짜: 2026-03-18
 *
 * 모든 카드를 담으려면 가로는 모든 카드 가로의 최댓값, 세로는 모든 카드 세로의 최댓값이어야 한다.
 * 카드는 회전 가능하므로, 각 카드마다 긴 쪽을 가로(x), 짧은 쪽을 세로(y)로 통일한 뒤
 * 전체 xMax, yMax를 구해 곱하면 최소 직사각형 넓이가 된다.
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
            int xMax = 0;
            int yMax = 0;

            for(int[] arr : sizes) {
                int x = Math.max(arr[0], arr[1]);
                int y = Math.min(arr[0], arr[1]);

                if(x > xMax) xMax = x;
                if(y > yMax) yMax = y;
            }
            return xMax * yMax;
        }
    }
}
