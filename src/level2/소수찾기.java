package level2;

import java.util.HashSet;
import java.util.Set;

/**
 * 문제: 소수 찾기
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42839
 * 플랫폼: 프로그래머스 Level 2
 * 유형: DFS
 * 시간복잡도: O(N!)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-02-25
 *
 * DFS 이용
 * 최초에 모든 숫자의 경우의 수를 DFS로 조합하여 set에다가 담는다.
 * set에 담긴 숫자중, 소수로직을 이용하여 소수일때만을 개수로 센다.
 */
public class 소수찾기 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("17"));   // 기댓값: 3
        System.out.println(sol.solution("011"));  // 기댓값: 2
    }

    static class Solution {
        public int solution(String numbers) {
            String[] numberArr = numbers.split("");
            boolean[] visited = new boolean[numberArr.length];
            Set<Integer> set = new HashSet<>();
            String current = "";
            dfs(numberArr, visited, current, set);

            int answer = 0;
            for (int num : set) {
                if (isPrime(num)) {
                    answer++;
                }
            }

            return answer;
        }

        public void dfs(String[] arr, boolean[] visited, String current, Set<Integer> set) {
            for (int i = 0; i < arr.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    set.add(Integer.valueOf(current + arr[i]));
                    dfs(arr, visited, current + arr[i], set);
                    visited[i] = false;
                }
            }
        }

        public boolean isPrime(int num) {
            if (num < 2) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
