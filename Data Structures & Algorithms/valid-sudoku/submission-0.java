class Solution {
    public static boolean isValidSudoku(char[][] board) {
        for (char[] chars : board) {
            Set<Character> rowMap = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (chars[j] == '.') continue;
                if (rowMap.contains(chars[j])) {
                    System.out.println(rowMap);
                    return false;
                } else {
                    rowMap.add(chars[j]);
                }

            }
        }

        for (int i = 0; i < board.length; i++) {
            Set<Character> columnMap = new HashSet<>();
            for (char[] chars : board) {
                if (chars[i] == '.') continue;
                if (columnMap.contains(chars[i])) {
                    return false;
                } else {
                    columnMap.add(chars[i]);
                }

            }
        }

        for (int square = 0; square < 9; square++) {
            Set<Character> squareMap = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (squareMap.contains(board[row][col])){
                        return false;
                    }
                    squareMap.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
