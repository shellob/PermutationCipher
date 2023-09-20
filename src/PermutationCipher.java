public class PermutationCipher {

    public static String encrypt(String text, int[] k1, int[] k2) {
        char[][] matrix = MatrixUtils.fillMatrixByRows(text, k1);
        return MatrixUtils.readMatrixByColumns(matrix, k2);
    }
}
