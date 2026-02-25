package level3;

/**
 * 문제: 네트워크
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/43162
 * 플랫폼: 프로그래머스 Level 3
 * 유형: DFS
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-02-25
 *
 * [풀이 접근 방식을 여기에 작성]
 */
public class 네트워크 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}})); // 기댓값: 2
        System.out.println(sol.solution(3, new int[][]{{1,1,1},{1,1,1},{1,1,1}})); // 기댓값: 1
        System.out.println(sol.solution(4, new int[][]{{1,1,0,0},{1,1,0,0},{0,0,1,1},{0,0,1,1}})); // 기댓값: 2
        System.out.println(sol.solution(4, new int[][]{{1,1,0,0},{1,1,0,0},{0,0,1,0},{0,0,0,1}})); // 기댓값: 3
    }

    static class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            
            return answer;
        }
    }
}
