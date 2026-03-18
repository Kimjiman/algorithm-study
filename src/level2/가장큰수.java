package level2;

/**
 * 문제: 가장 큰 수
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42746
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 정렬 + Comparator
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-03-18
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 */
public class 가장큰수 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[] numbers1 = {6, 10, 2};
        System.out.println(sol.solution(numbers1)); // 기댓값: "6210"

        // 테스트케이스 2
        int[] numbers2 = {3, 30, 34, 5, 9};
        System.out.println(sol.solution(numbers2)); // 기댓값: "9534330"
    }

    static class Solution {
        public String solution(int[] numbers) {
            String answer = "";

            return answer;
        }
    }
}
