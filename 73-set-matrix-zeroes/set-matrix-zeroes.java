class Solution {
    public void setZeroes(int[][] matrix) {
      int rowLength = matrix.length;
      int colLength = matrix[0].length;
      boolean[] rowMarker = new boolean[rowLength];
      boolean[] colMarker = new boolean[colLength];
      for(int row = 0; row < rowLength; row++) {
        for(int col = 0; col < colLength; col++) {
            if(matrix[row][col] == 0) {
                rowMarker[row] = true;
                colMarker[col] = true;
            }
        }
      }
        for(int i = 0; i < rowLength; i++) {
            if(rowMarker[i]) {
                Arrays.fill(matrix[i], 0);
            }
        }

        for(int j = 0; j < colLength; j++) {
            if(colMarker[j]) {
                for(int row = 0; row < rowLength; row++) {
                    matrix[row][j] = 0;
                }
            }
        } 
    }
}