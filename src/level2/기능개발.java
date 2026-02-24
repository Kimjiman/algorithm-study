package level2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 문제: 기능개발
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42586
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 큐
 * 시간복잡도: 1. O(N) 2. O(N)
 * 공간복잡도: 1. O(1) 2. O(N)
 * 풀이 날짜: 2026-02-23
 *
 * 1. 변수풀이법
 * 기능과 스피드의 개수가 같으므로, 기능 배열에서 루프를 돌려 잔여시간을 산출 (result)
 * -> 잔여시간과 다음 잔여시간을 비교하여, 다음 잔여시간이 더 클 경우 기존의 잔여시간을 신규 잔여시간으로 교체
 * -> 신규 잔여시간으로 교체된 순간 list에 cnt를 담는다. 다음 잔여시간이 더 작을경우에는 cnt++
 * 2. 큐풀이법
 * 기능과 스피드의 개수가 같으므로, 기능 배열에서 루프를 돌려 잔여시간을 큐에 전부 담는다
 * -> 잔여시간과 다음 잔여시간을 비교하여, 다음 잔여시간이 더 클 경우 기존의 잔여시간을 신규 잔여시간으로 교체
 * -> 신규 잔여시간으로 교체된 순간 list에 cnt를 담는다. 다음 잔여시간이 더 작을경우에는 cnt++
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

        // 테스트케이스 3
        int[] progresses3 = {93};
        int[] speeds3 = {1};
        System.out.println(java.util.Arrays.toString(sol.solution(progresses3, speeds3))); // 기댓값: [1]
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> list = new LinkedList<>();
            int tmp = (100 - progresses[0] + speeds[0] - 1) / speeds[0];
            int cnt = 1;

            for(int i = 1; i < progresses.length; i++) {
                /*int result = (100 - progresses[i]) / speeds[i];        // 이전 방식: 조건 분기
                if(result * speeds[i] + progresses[i] < 100) result++;*/
                int result = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

                if(result > tmp) {
                    list.add(cnt);
                    tmp = result;
                    cnt = 1;
                } else {
                    cnt++;
                }
            }

            list.add(cnt);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }

        public int[] solution2(int[] progresses, int[] speeds) {
            List<Integer> list = new LinkedList<>();
            Queue<Integer> queue = new LinkedList<>();
            int tmp = 0;

            for(int i = 0; i < progresses.length; i++) {
                int result = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
                queue.add(result);
            }

            int cnt = 1;
            while(!queue.isEmpty()) {
                int pre = queue.poll();
                if(tmp < pre) tmp = pre;
                if (queue.isEmpty()) break;

                if (tmp < queue.peek()) {
                    list.add(cnt);
                    cnt = 1;
                } else {
                    cnt++;
                }
            }

            list.add(cnt);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
