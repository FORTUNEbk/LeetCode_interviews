public class EqualRowNColumn {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isEqual = true;
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        EqualRowNColumn mymethod = new EqualRowNColumn();
        int[][] myArray = {
            {3, 2, 1},
            {1, 7, 6},
            {2, 7, 7}
        };
        System.out.println(mymethod.equalPairs(myArray));
    }
}