public class MatrixUtils {

    public static char[][] fillMatrixByRows(String text, int[] k1) {
        int rows = k1.length;
        int cols = text.length() / rows;
        char[][] matrix = new char[rows][cols];
        char[][] reorderedMatrix = new char[rows][cols];

        int charPos = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = text.charAt(charPos++);
            }
        }

        System.out.println("Matrix after filling by rows:");
        printMatrix(matrix);

        for (int i = 0; i < rows; i++) {
            reorderedMatrix[k1[i] - 1] = matrix[i].clone();
        }

        System.out.println("\nMatrix after reordering by k1:");
        printMatrix(reorderedMatrix);

        return reorderedMatrix;
    }

    public static String readMatrixByColumns(char[][] matrix, int[] k2) {
        StringBuilder result = new StringBuilder();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int k : k2) {
            for (int i = 0; i < rows; i++) {
                result.append(matrix[i][k - 1]);
            }
            System.out.println("\nPartial encrypted text after reading column " + k + ":");
            System.out.println(result.toString());
        }

        return result.toString();
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
