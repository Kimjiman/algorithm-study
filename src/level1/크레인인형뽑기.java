package level1;

import java.util.Stack;

/**
 * 문제: 크레인 인형뽑기 게임
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/64061
 * 플랫폼: 프로그래머스 Level 1
 * 유형: 스택 + 시뮬레이션
 * 시간복잡도: O(N^2)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-03-18
 *
 * moves를 순회하며 해당 열에서 가장 위의 인형을 스택에 push한다.
 * push 후 스택 top 두 개가 같으면 pop하고 answer를 증가시킨다.
 * 최종적으로 answer * 2를 반환한다. (쌍으로 제거되므로)
 */
public class 크레인인형뽑기 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[][] board = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(sol.solution(board, moves)); // 기댓값: 4
    }

    static class Solution {
        public int solution(int[][] board, int[] moves) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;
            for(int it : moves) {
                int y = it - 1;
                for(int x = 0; x < board.length; x++) {
                    if (board[x][y] != 0) {
                        stack.push(board[x][y]);
                        board[x][y] = 0;

                        if (stack.size() > 1) {
                            int a = stack.pop();
                            int b = stack.peek();
                            if (a == b) {
                                stack.pop();
                                answer++;
                            } else {
                                stack.push(a);
                            }
                        }
                        break;
                    }
                }
            }

            return answer * 2;
        }
    }
}
