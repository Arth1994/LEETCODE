class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> grid = new HashSet<>();
            for(int j = 0; j < 9; j++){
                //Check for row
                if(board[i][j] != '.' && row.contains(board[i][j])){
                    return false;
                }else{
                    row.add(board[i][j]);
                }
                //Check for Column
                if(board[j][i] != '.' && col.contains(board[j][i])){
                    return false;
                }else{
                    col.add(board[j][i]);
                }
                //Check Grid 
                int gridX = 3*(i/3);
                int gridY = 3*(i % 3);
                int elementLocX = gridX + (j/3);
                int elementLocY = gridY + (j%3);
                if(board[elementLocX][elementLocY] != '.' && grid.contains(board[elementLocX][elementLocY])){
                    return false;
                }else{
                    grid.add(board[elementLocX][elementLocY]);
                }
            }
        }
        return true;
    }
}