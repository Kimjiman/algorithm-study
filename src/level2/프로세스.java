package level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제: 프로세스
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42587
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 큐
 * 시간복잡도: O(N^3)
 * 공간복잡도: O(N)
 * 풀이 날짜: 2026-02-24
 *
 * 우선순위와 현재 프로세스의 인덱스를 담은 큐를 생성한다.
 * -> 큐내부에서 큐의 최대 max를 가진 프로세스와 큐에서 나온 값이 같을 경우 poll
 * -> 큐내부에서 큐의 최대 max를 가진 프로세스와 큐에서 나온 값이 같지 않을 경우 poll and offer
 * -> 큐내부에서 큐의 최대 max를 가진 프로세스와 큐에서 나온 값이 같고, 실행순서를 구할 프로세스의 인덱스와 큐에서 나온 인덱스가
 * 같을 경우 return 한다.
 */
public class 프로세스 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[] priorities1 = {2, 1, 3, 2};
        System.out.println(sol.solution(priorities1, 2)); // 기댓값: 1

        // 테스트케이스 2
        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        System.out.println(sol.solution(priorities2, 0)); // 기댓값: 5

        // 테스트케이스 3
        int[] priorities3 = {5, 1, 2, 5, 1};
        System.out.println(sol.solution(priorities3, 2)); // 기댓값: 3
    }

    static class Solution {
        public int solution(int[] priorities, int location) {
            Queue<int[]> queue = new LinkedList<>();

            int answer = 0;
            for (int i = 0; i < priorities.length; i++) {
                queue.offer(new int[]{priorities[i], i});
            }

            while (!queue.isEmpty()) {
                int[] tmp = queue.peek();
                int result = tmp[0];

                if(queue.stream().mapToInt(it -> it[0]).max().getAsInt() == result) {
                    answer++;
                    if (location == tmp[1]) {
                        break;
                    }
                    queue.poll();
                } else {
                    queue.poll();
                    queue.offer(tmp);
                }
            }

            return answer;
        }
    }
}
