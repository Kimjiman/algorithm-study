package level2;

import java.util.Stack;

/**
 * 문제: 주식가격
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42584
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 스택
 * 시간복잡도: 1. O(N^2) 2. O(N)
 * 공간복잡도: 1. O(1)   2. O(N)
 * 풀이 날짜: 2026-02-24
 *
 * 1. 이중루프
 * 2. 스택을 이용한 단조스택(다시풀어봐야할듯)
 */
public class 주식가격 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(java.util.Arrays.toString(sol.solution2(prices))); // 기댓값: [4, 3, 1, 1, 0]
        // 테스트케이스 2
        int[] prices2 = {3, 1, 2};
        System.out.println(java.util.Arrays.toString(sol.solution2(prices2))); // 기댓값: [1, 1, 0]
        // 테스트케이스 3
        int[] prices3 = {1, 5, 0, 1};
        System.out.println(java.util.Arrays.toString(sol.solution2(prices3))); // 기댓값: [2, 1, 1, 0]
    }

    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            int cnt = 0;

            for(int i = 0; i < prices.length; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    cnt++;
                    if (prices[i] > prices[j]) {
                        break;
                    }
                }
                answer[i] = cnt;
                cnt = 0;
            }

            return answer;
        }

        public int[] solution2(int[] prices) {
            int[] answer = new int[prices.length];
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < prices.length; i++) {
                while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                    answer[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }

            while(!stack.isEmpty()) {
                answer[stack.peek()] = prices.length - 1 - stack.peek();
                stack.pop();
            }

            return answer;
        }
    }
}
