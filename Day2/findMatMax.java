package Day2;

public class findMatMax {

    public int[][] createMatrix() {
        /*
         * creates a matrix filled with random values
         */
        int row = (int) ((Math.random() * (10 - 4)) + 1);
        int column = (int) ((Math.random() * (10 - 4)) + 1);

        int[][] matrix = new int[row][column];

        fillRandomMatrix(matrix, row, column);

        return matrix;
    }

    private void fillRandomMatrix(int[][] matrix, int row, int column) {

        // this should be the quickest way to navigate the matrix
        // given that java is row-major
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[0].length; m++) {
                matrix[n][m] = (int) ((Math.random() * (10000 - 1)) + 1);
            }
        }
    }

    public void printMatrix(int[][] matrix) {
        System.out.println();
        for (int m = 0; m < matrix[0].length; m++) {
            for (int n = 0; n < matrix.length; n++) {
                System.out.print(matrix[n][m] + "\t");
            }
            System.out.println();
        }
    }

    public int[] getMaxIndexes(int[][] matrix) {
        int[] maxIndex = new int[2];
        maxIndex[0] = 0;
        maxIndex[1] = 0;

        int max = -1;
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[0].length; m++) {
                if (matrix[n][m] > max) {
                    maxIndex[0] = n;
                    maxIndex[1] = m;
                    max = matrix[n][m];
                }
            }
        }
        return maxIndex;

    }

    public static void main(String[] args) {

        findMatMax fmm = new findMatMax();
        int[][] matrix = fmm.createMatrix();
        fmm.printMatrix(matrix);
        // new int[2];
        int[] maxIndexes = fmm.getMaxIndexes(matrix);

        System.out.println("the max is " + matrix[maxIndexes[0]][maxIndexes[1]] + " located at (" + maxIndexes[0] + ","
                + maxIndexes[1] + ")");

    }

}
