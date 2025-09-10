public class star6{
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int space = 0; space < 10; space++) {
                System.out.print(" ");
            }     
            for (int col = 0; col < 2*(10-row); col++) {
                System.out.print("*");
            } System.out.println(" ");  }
    }
}