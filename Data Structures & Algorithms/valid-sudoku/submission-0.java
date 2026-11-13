class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row =0;row<9;row++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0;i<9;i++){
                Character item = board[row][i];
                if(item == '.') continue;
                else if(!seen.add(item)) return false;
            }

        }
            for(int col =0;col<9;col++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0;i<9;i++){
                Character item = board[i][col];
                if(item == '.') continue;
                else if(!seen.add(item)) return false;
            }

        }
         Set<Character> bx1= new HashSet<>();
         Set<Character> bx2= new HashSet<>();
         Set<Character> bx3= new HashSet<>();

        //3 Upper Sqaure
        for(int i =0;i<3;i++){
            for(int k =0;k<3;k++){
                Set<Character> seen = new HashSet<>();
                for(int row = i*3;row<i*3+3;row++){
                    for(int col =k*3;col<k*3+3;col++){
                        Character item = board[row][col];
                        if(item=='.') continue;
                        if(!seen.add(item)) {
                            return false;
                        }             }
            }
                 }
        }

        return true;
    }
}
