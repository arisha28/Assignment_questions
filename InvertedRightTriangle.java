public class InvertedRightTriangle{
    public static void main(String[] args) {
        for (int row = 1; row <=10; row++) {
            for (int space = 1; space < 10; space++) {
                System.out.print(" ");
            }     
            for (int col = 1; col < 2*(10-row); col++) {
                System.out.print("*");
            } System.out.println(" ");  }
    }
}