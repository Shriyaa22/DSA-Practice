class Solution {
    int m, n;
    public void solve(char[][] board) {
        Queue<int[]> queue = new ArrayDeque<>();
        m = board.length;
        n = board[0].length;
        // vertical  
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                queue.offer(new int[] {i, 0});
            }
            if (board[i][n-1] == 'O') {
                queue.offer(new int[] {i, n-1});
            }
        }
        // horizontal
        for (int i = 0; i < n-1; i++) {
            if (board[0][i] == 'O') {
                queue.offer(new int[] {0, i});
            }
            if (board[m-1][i] == 'O') {
                queue.offer(new int[] {m-1, i});
            }
        }
        List<int[]> positions = bfs(board, queue);
        for (char[] _board: board) {
            Arrays.fill(_board, 'X');
        }
        for (int[] pos: positions) {
            int r = pos[0];
            int c = pos[1];
            board[r][c] = 'O';
        }

    }
    private boolean isValid(int i, int j) {
        if ( i < 0 || j < 0) return false;
        if ( i >= m || j >= n ) return false;
        return true;
    }
    private List<int[]> bfs(char[][] board, Queue<int[]> queue) {
        final int[] dr = {-1, 1, 0, 0};
        final int[] dc= {0, 0 , -1, 1};
        List<int[]> list = new ArrayList<>();
        list.addAll(queue);
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            for (int i = 0; i < 4; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];

                if (isValid(newRow, newCol) && board[newRow][newCol] == 'O') {
                    list.add(new int[] {newRow, newCol});
                    board[newRow][newCol] = 'X';
                    queue.offer(new int[] {newRow, newCol});
                }
            }
        }
        return list;
    }
}