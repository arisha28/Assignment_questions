public class star20 {
    public static void main(String[] args) {
        char alphabet = 'A';
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println("");
        }
    }
}