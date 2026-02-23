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
 * 스택의 isEmpty의 true/false를 기반으로 해당 알고리즘 수행가능
 * -> () 가 들어왔을 경우 pop하는 것이 기본정책이며, (( 와 같이 후에 ))가 예상되어야 하는 경우, push하는것이 정책이다.
 * ->  if (c == ')')  해당 조건때문에 else조건에는 항상 '(' 인것만 스택에 들어올수있다.
 */
public class 올바른괄호 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("()()")); // 기댓값: true
        System.out.println(sol.solution("(())()")); // 기댓값: true
        System.out.println(sol.solution(")()("));   // 기댓값: false
        System.out.println(sol.solution("(()("));   // 기댓값: false
        System.out.println(sol.solution("())"));   // 기댓값: false
    }

    static class Solution {
        public boolean solution(String s) {
            boolean answer = true;

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(stack.isEmpty()) {
                    if (c == ')') {
                        answer = false;
                        break;
                    }
                    stack.push(c);
                } else {
                    if (c == ')') {
                        stack.pop();
                    } else if (c == '(') {
                        stack.push(c);
                    }
                }
            }

            if(!stack.isEmpty()) answer = false;
            return answer;
        }
    }
}
