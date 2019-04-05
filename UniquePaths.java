class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] answer = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0)
                    answer[i][j] = 1;
                else{
                    answer[i][j] = answer[i - 1][j] + answer[i][j - 1];
                }
            }
        }
        return answer[m - 1][n - 1];
    }
}