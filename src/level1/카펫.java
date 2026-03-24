package level1;

/**
 * 문제: 카펫
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42842
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 완전탐색
 * 시간복잡도: O(√N) — N = brown + yellow
 * 공간복잡도: O(1)
 * 풀이 날짜: 2026-03-19
 *
 * [풀이 접근 방식]
 * 카펫 전체 크기 total = brown + yellow = 가로(j) * 세로(i).
 * 가로/세로가 결정되면 안쪽 노란 영역은 (j-2)*(i-2)로 구할 수 있다.
 * i <= j 조건 하에 i를 3부터 √total까지 순회하며,
 * total의 약수인 i에 대해 j = total / i를 계산하고
 * (i-2)*(j-2) == yellow를 만족하는 쌍을 찾는다.
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
            int[] answer = new int[2];
            int total = brown + yellow;

            // (x - 2) * (y - 2) = yellow 일때
            for(int i = 3; i <= Math.sqrt(total); i++) {
                if(total % i != 0) continue;
                int j = total / i;
                if((i - 2) * (j - 2) == yellow) {
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }

            return answer;
        }
    }
}
