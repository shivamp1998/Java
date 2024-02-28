package Java;
class ValidateSudoko {
    public boolean validateRowCol(char[][] board) {
        boolean flag = true;
        for(int i=0; i<9; i++) {
            boolean visited[] = new boolean[10];
            for(int j=0; j<9; j++) {
                if(board[i][j] != '.' && !visited[board[i][j] - '0'])
                    visited[board[i][j] - '0'] = true;
                else if (board[i][j] != '.' && visited[board[i][j] - '0'] == true){
                    flag = false;
                }else continue;
            }
        }

        for(int i=0; i<9; i++) {
            boolean visited[] = new boolean[10];
            for(int j=0; j<9; j++) {
                if(board[j][i] != '.' && !visited[board[j][i] - '0']){
                    visited[board[j][i] - '0'] = true;
                } 
                else if (board[j][i] != '.' && visited[board[j][i] - '0'] == true){
                    flag = false;
                }else continue;
            }
        }

        return flag;

    }

    public boolean validateGrid(char[][] board, int rowStart, int rowEnd, int colStart, int colEnd) {
        boolean visited [] = new boolean [10];
        for(int i=rowStart; i<rowEnd; i++) {
            for(int j=colStart; j<colEnd; j++) {
                if(board[i][j] != '.' && !visited[board[i][j] - '0']) {
                    visited[board[i][j] - '0'] = true;
                }else if(board[i][j] != '.' && visited[board[i][j] - '0']) return false;
                else  continue;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        boolean flag =  validateRowCol(board);
        for(int i=0; i<9; i+=3) {
            for(int j=0; j<9; j+=3) {
                flag = flag && validateGrid(board, i, i+3,j,j+3);
            }
        }
        return flag;
    }
}