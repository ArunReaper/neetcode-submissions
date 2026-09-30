class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer, Set<Character>> rowSet = new HashMap<>();
        Map<Integer, Set<Character>> columnSet = new HashMap<>();
        Map<String, Set<Character>> boxSet = new HashMap<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){

                if(board[i][j] == '.') continue;
                String squareKey = (i / 3) + "," + (j / 3);

                if(rowSet.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j]) ||
                   columnSet.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]) ||
                   boxSet.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[i][j])){
                    return false;
                }
                rowSet.get(i).add(board[i][j]);
                columnSet.get(j).add(board[i][j]);
                boxSet.get(squareKey).add(board[i][j]);

            }
        }
        return true;
    }
}
