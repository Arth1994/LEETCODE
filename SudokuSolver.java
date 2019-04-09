class SudokuSolver {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length < 9)
            return;
        solveSudokuHelper(board, 0);
    }
    private boolean solveSudokuHelper(char[][] board, int index){
        if(index == 81)
            return true;
        int i = index/9, j = index % 9;
        if(board[i][j] != '.')
            return solveSudokuHelper(board, index + 1);
        else{
            for(char f = '1'; f <= '9'; f++){
                if(isValid(i, j, board, f)){
                    board[i][j] = f;
                    if(solveSudokuHelper(board, index + 1))
                        return true;
                    board[i][j] ='.';
                }
            }
        }
        return false;
    }
    private boolean isValid(int row, int col, char[][] board, char f){
        for(int i = 0; i < 9; i++){
            int chosenGrid = row/3*3 + col/3;
            int gridPosX = 3 * (chosenGrid / 3);
            int gridPosY = 3 * (chosenGrid % 3);
            int posX = gridPosX + i/3;
            int posY = gridPosY + i%3;
            if(board[row][i] == f || board[i][col] == f || board[posX][posY] == f)
                return false;
        }
        return true;
    }
        
}