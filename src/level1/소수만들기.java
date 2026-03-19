package level1;

/**
 * 문제: 소수 만들기
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/12977
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 완전탐색
 * 시간복잡도: O(N^3 * sqrt(M))
 * 공간복잡도: O(1)
 * 풀이 날짜: 2026-03-19
 *
 * 3중 루프로 nums에서 3개 숫자의 모든 조합을 구하고, 합이 소수인 경우를 카운트한다.
 * 소수 판별은 2부터 sqrt(number)까지만 나누어 떨어지는지 확인한다.
 */
public class 소수만들기 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{1, 2, 3, 4})); // 기댓값: 1
        System.out.println(sol.solution(new int[]{1, 2, 7, 6, 4})); // 기댓값: 4
    }

    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            for(int i = 0; i < nums.length - 2; i++) {
                int a = nums[i];
                for (int j = i + 1; j < nums.length - 1; j++) {
                    int b = nums[j];
                    for(int k = j + 1; k < nums.length; k++) {
                        int c = nums[k];
                        if (isSosu(a + b + c)) answer++;
                    }
                }
            }
            return answer;
        }

        public static boolean isSosu(int number) {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) return false;
            }
            return true;
        }
    }
}
