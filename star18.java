public class star18 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(col/2);
            }
            System.out.println("");
        }
    }
}