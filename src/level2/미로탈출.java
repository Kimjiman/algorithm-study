package level2;

/**
 * 문제: 미로 탈출
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/159993
 * 플랫폼: 프로그래머스 Level 2
 * 유형: BFS
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-19
 *
 * [풀이 접근 방식 — Claude가 풀이 완료 후 작성]
 */
public class 미로탈출 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new String[]{"SOOOL", "XXXXL", "LEEEL", "LXLXL", "LEEEX"})); // 기댓값: 16
        System.out.println(sol.solution(new String[]{"LOOX", "OOOО", "OOSО", "ОООО", "ОООE"}));      // 기댓값: -1
    }

    static class Solution {
        public int solution(String[] maps) {
            int answer = 0;
            return answer;
        }
    }
}
