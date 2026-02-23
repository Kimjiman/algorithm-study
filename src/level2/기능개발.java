package level2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 문제: 기능개발
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42586
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 큐
 * 시간복잡도: O(?)
 * 공간복잡도: O(?)
 * 풀이 날짜: 2026-02-23
 *
 * [풀이 접근 방식을 여기에 작성하세요]
 */
public class 기능개발 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        System.out.println(java.util.Arrays.toString(sol.solution(progresses1, speeds1))); // 기댓값: [2, 1]

        // 테스트케이스 2
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        System.out.println(java.util.Arrays.toString(sol.solution(progresses2, speeds2))); // 기댓값: [1, 3, 2]
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> list = new LinkedList<>();
            Queue<Integer> queue = new LinkedList<>();
            int cnt = 1;
            for(int i = 0; i < progresses.length; i++) {
                int result = (100 - progresses[i]) / speeds[i];
                if(result * speeds[i] + progresses[i] < 100) result++;
                if(queue.isEmpty()) {
                    queue.offer(result);
                } else {
                    if(result > queue.peek()) {
                        queue.poll();
                        cnt = 1;
                    } else {
                        cnt++;
                    }
                    list.add(cnt);
                }
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
