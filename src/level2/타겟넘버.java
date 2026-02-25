package level2;

/**
 * 문제: 타겟 넘버
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/43165
 * 플랫폼: 프로그래머스 Level 2
 * 유형: DFS
 * 시간복잡도: O(2^N)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-02-25
 *
 * DFS 이용
 * 모든 숫자의 +, - 되는 경우를 깊이 우선 탐색하기 위해서 dfs 순환을 위해 dfs 내부에 +, - 를 전파한다.
 */
public class 타겟넘버 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{1, 1, 1, 1, 1}, 3)); // 기댓값: 5
        System.out.println(sol.solution(new int[]{4, 1, 2, 1}, 4));    // 기댓값: 2
    }

    static class Solution {
        public int solution(int[] numbers, int target) {
            int current = 0;
            int index = 0;
            return dfs(numbers, current, index, target);
        }

        public int dfs(int[] numbers, int current, int index, int target) {
            if(index == numbers.length) {
                return target == current ? 1 : 0;
            }

            int plus = dfs(numbers, current + numbers[index], index + 1, target);
            int minus = dfs(numbers, current - numbers[index], index + 1, target);
            return plus + minus;
        }
    }
}
