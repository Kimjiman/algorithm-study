package level1;

/**
 * 문제: 실패율
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42889
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 정렬 + 구현
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-18
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 */
public class 실패율 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(java.util.Arrays.toString(sol.solution(5, stages1))); // 기댓값: [3, 4, 2, 1, 5]

        // 테스트케이스 2
        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(java.util.Arrays.toString(sol.solution(4, stages2))); // 기댓값: [4, 1, 2, 3]
    }

    static class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = {};
            return answer;
        }
    }
}
