class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows= new HashSet[9];
        Set<Character>[] cols= new HashSet[9];
        Set<Character>[] boxes= new HashSet[9];

        for(int i=0; i<9; i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        int boxIndex=0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.'){
                    continue;
                }

                boxIndex= (i/3)*3+j/3;

                if(!rows[i].add(board[i][j]) || !cols[j].add(board[i][j]) || !boxes[boxIndex].add(board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
}
