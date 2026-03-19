package level2;

import java.util.Stack;

/**
 * 문제: 큰 수 만들기
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42883
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 탐욕법
 * 시간복잡도: O(N)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-03-19
 *
 * 스택을 사용한 탐욕법 풀이.
 * 앞에서부터 숫자를 순회하며, 현재 숫자(cur)가 스택 top보다 크면
 * count < k인 동안 스택에서 pop(작은 숫자 제거)한다.
 * 이후 cur을 push한다.
 * 루프 종료 후 스택을 문자열로 변환하고, 앞에서 (number.length - k)개만 잘라 반환한다.
 * (단조 감소 스택 패턴 — 항상 큰 수가 앞에 오도록 유지)
 */
public class 큰수만들기 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("1924", 2)); // 기댓값: "94"
        System.out.println(sol.solution("1231234", 3)); // 기댓값: "3234"
        System.out.println(sol.solution("4177252841", 4)); // 기댓값: "775841"
        System.out.println(sol.solution("9876", 2)); // 기댓값: "98"
    }

    static class Solution {
        public String solution(String number, int k) {
            int count = 0;
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < number.length(); i++) {
                if(stack.isEmpty()) {
                    stack.push(number.charAt(i));
                    continue;
                }

                int cur = Integer.parseInt(String.valueOf(number.charAt(i)));
                int top = Integer.parseInt(String.valueOf(stack.peek()));

                if(count == k) {
                    stack.push(number.charAt(i));
                    continue;
                }

                if(cur > top) {
                    while (count < k) {
                        if(stack.isEmpty()) break;
                        int top2 = Integer.parseInt(String.valueOf(stack.peek()));
                        if (cur > top2) {
                            stack.pop();
                            count++;
                        } else {
                            break;
                        }
                    }
                }
                stack.push(number.charAt(i));
            }

            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }

            return sb.reverse().substring(0, number.length() - k);
        }
    }
}
