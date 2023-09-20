public class Main {
    public static void main(String[] args) {
        String text = "ШИФРОВАНИЕ_ПЕРЕСТАНОВКОЙ_";
        int[] k1 = {1, 2, 4, 5, 3};
        int[] k2 = {2, 5, 1, 3, 4};

        String cipherText = PermutationCipher.encrypt(text, k1, k2);
        System.out.println("Encrypted text: " + cipherText);
    }
}
