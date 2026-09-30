class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                
                char currentVal = board[i][j];
                if(currentVal == '.') continue;
                if(!seen.add(currentVal + " in row " + i)
                || !seen.add(currentVal + " in col " + j)
                || !seen.add(currentVal + " in box " + i/3 + "," + j/3)){
                    return false;
                }
            }
        }
        return true;
    }
}
