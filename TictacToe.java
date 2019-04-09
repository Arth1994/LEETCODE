class TicTacToe{   
    /* 
    Player is either deifined with id 0 or id 1
    row is row index
    col is column index
    -1 if move is made by player 0 and +1 if move is made by player 1
    IllegalArguementException if the move is illegal
    */
    private final int[][] board;
    
    public TicTacToe(final int n){
        board = new int[n][n];
    }

    public int move(int player, int row, int col) throws IllegalArguementException{
        if(row < 0 || col < 0 || row >= n || col >= n){
            throw new IllegalArguementException("Out of Bounds");
        }else if(board[row][col] != 0){
            throw new IllegalArguementException("Board Already Occupied");
        }else if(player != 0 && palyer != 1){
            throw new IllegalArguementException("Player is Not Valid");
        }else{
            player = player == 0 ? -1 : 1;
            if(player == 0){
                board[row][col] = -1;
            }else
                board[row][col] = 1;
                boolean rowResult = true, colResult = true, diagResult = true, revDiagResult = true;
                for(int i = 0; i < n; i++){
                    if(board[row][i] != player){
                        rowResult = false;
                    }
                    if(board[i][col] != player){
                        colResult = false;
                    }
                    if(board[i][i] != player){
                        diagResult = false;
                    }
                    if(board[i][col] != player){
                        revDiagResult = false;
                    }
                }
                if(rowResult || colResult || diagResult || revDiagResult){
                    return player;
                }
        }
    }
}