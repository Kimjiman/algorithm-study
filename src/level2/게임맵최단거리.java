package level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제: 게임 맵 최단거리
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/1844
 * 플랫폼: 프로그래머스 Level 2
 * 유형: BFS
 * 시간복잡도: O(N*M)
 * 공간복잡도: O(N*M)
 * 풀이 날짜: 2026-02-26
 * BFS로 (0,0)에서 출발해 (N-1, M-1)까지 최단 거리를 탐색한다.
 * 큐에 {행, 열, 이동거리}를 함께 저장하고, visited 배열로 재방문을 방지한다.
 * 목적지에 도달하면 즉시 이동거리를 반환하고, 큐가 빌 때까지 도달하지 못하면 -1을 반환한다.
 */
public class 게임맵최단거리 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트케이스 1
        int[][] progresses1 = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };
        System.out.println(sol.solution(progresses1)); // 11

        // 테스트케이스 2
        int[][] progresses2 = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}
        };
        System.out.println(sol.solution(progresses2)); // -1
    }

    static class Solution {
        public int solution(int[][] maps) {
            int answer = -1;
            boolean[][] visited = new boolean[maps.length][maps[0].length];
            Queue<int[]> queue = new LinkedList<>();

            // 가로, 세로, 이동거리
            queue.add(new int[]{0, 0, 1});
            visited[0][0] = true;

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];
                int count = cur[2];

                // 도착했을때 블락 이동거리가 정답
                if (cur[0] == maps.length - 1 && cur[1] == maps[0].length - 1) {
                    answer = cur[2];
                    break;
                }

                // 동
                if (x + 1 < maps.length && maps[x + 1][y] != 0 && !visited[x + 1][y]) {
                    visited[x + 1][y] = true;
                    queue.offer(new int[]{x + 1, y, count + 1});
                }

                // 서
                if (x - 1 >= 0 && maps[x - 1][y] != 0  && !visited[x - 1][y]) {
                    visited[x - 1][y] = true;
                    queue.offer(new int[]{x - 1, y, count + 1});
                }

                // 남
                if (y - 1 >= 0 && maps[x][y - 1] != 0 && !visited[x][y - 1]) {
                    visited[x][y - 1] = true;
                    queue.offer(new int[]{x, y - 1, count + 1});
                }

                // 북
                if (y + 1 < maps[0].length && maps[x][y + 1] != 0 && !visited[x][y + 1]) {
                    visited[x][y + 1] = true;
                    queue.offer(new int[]{x, y + 1, count + 1});
                }
            }

            return answer;
        }
    }
}
