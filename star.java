public class star{
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int space = 0; space < 10-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 10; col++) {
        if(row == 0 || row == 9 || col == 0 || col == 9){
                System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println(" ");
        }
    }
}