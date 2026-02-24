package level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제: 다리를 지나는 트럭
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/42583
 * 플랫폼: 프로그래머스 Level 2
 * 유형: 큐
 * 시간복잡도: O(N * M) — N: 트럭 수, M: 다리 길이
 * 공간복잡도: O(N + M) — N: 트럭 수, M: 다리 길이
 * 풀이 날짜: 2026-02-24
 *
 * 대기 큐, 진행 큐를 생성한다.
 * 다리길이=진행 큐, 다리길이는 건너는 시간, 진행 큐 같은 경우 항상 길이만큼 데이터를 생성해둔다.(건너는 트럭이없다면 0으로)
 * while Loop를 돌려, 1초 경과되는 시간 사이클을 형성한다.
 * 다리를 건널수 있는 트럭은 무게이하만큼만 가능하다.
 * 대기큐에서 진행큐로 조건에 부합하면, totalTruckWeight를 갱신하고 진행큐에 대기큐 데이터를 넣는다.
 * 진행큐에서 완료된다면 totalTruckWeight와 totalSuccessWeight을 갱신한다.
 * 대기큐에서 진행큐로 조건에 부합하지 않으면, 진행큐에 0데이터를 넣는다.
 * 최종 totalSuccessWeight == totalSumWeight 인경우 answer를 리턴한다.
 *
 */
public class 다리를지나는트럭 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        System.out.println(sol.solution(2, 10, new int[]{7, 4, 5, 6})); // 기댓값: 8

        // 테스트케이스 2
        System.out.println(sol.solution(100, 100, new int[]{10})); // 기댓값: 101

        // 테스트케이스 3
        System.out.println(sol.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10})); // 기댓값: 110
    }

    static class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> waitingQueue = new LinkedList<>();
            Queue<Integer> playingQueue = new LinkedList<>();

            int answer = 0;
            int totalTruckWeight = 0;
            int totalSumWeight = 0;
            int totalSuccessWeight = 0;

            for(int i = 0; i < truck_weights.length; i++) {
                waitingQueue.add(truck_weights[i]);
                totalSumWeight += truck_weights[i];
            }

            for (int i = 0; i < bridge_length; i++) {
                playingQueue.add(0);
            }

            while(totalSumWeight != totalSuccessWeight) {
                answer++;
                // 진행 -> 완료
                if (!playingQueue.isEmpty()) {
                    totalTruckWeight -= playingQueue.peek();
                    totalSuccessWeight += playingQueue.poll();
                }

                // 대기 -> 진행
                if(!waitingQueue.isEmpty()) {
                    int nextTotalTruckWeight = totalTruckWeight + waitingQueue.peek();
                    if (weight >= nextTotalTruckWeight) {
                        totalTruckWeight += waitingQueue.peek();
                        playingQueue.offer(waitingQueue.poll());
                    } else {
                        playingQueue.offer(0);
                    }
                }
            }

            return answer;
        }
    }
}
