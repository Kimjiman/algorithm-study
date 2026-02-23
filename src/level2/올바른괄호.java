package level2;

import java.util.Stack;

/**
 * 문제: 올바른 괄호
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/12909
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 스택
 * 시간복잡도: O(N)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-02-23
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 */
public class 올바른괄호 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("()()")); // 기댓값: true
        System.out.println(sol.solution("(())()")); // 기댓값: true
        System.out.println(sol.solution(")()("));   // 기댓값: false
        System.out.println(sol.solution("(()("));   // 기댓값: false
        System.out.println(sol.solution("())"));   // 기댓값: true
    }

    static class Solution {
        public boolean solution(String s) {
            boolean answer = true;

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(!stack.isEmpty()) {
                    char preC = stack.peek();
                    if (preC == '(' && c == ')') {
                        stack.pop();
                    } else if (preC == '(' && c == '(') {
                        stack.push(c);
                    }
                } else {
                    if(c == ')') {
                        answer = false;
                        break;
                    }
                }
            }

            if(!stack.isEmpty()) answer = false;
            return answer;
        }
    }
}
