public class Tree {
    public static void main(String[] args) {
        int height = 16;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }                               // Prints out Space. This look will continue to print until false THEN
            // Change the Value of i
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }                               // Prints out * as long as loop is true AFTER Printing out First Loop

            System.out.println();           // Just Prints 10 lines
        }



    }


}
