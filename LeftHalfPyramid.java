public class LeftHalfPyramid{
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int space = 10-row; space >1; space--) {
                System.out.print(" ");
            }
            for (int col = 0; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}