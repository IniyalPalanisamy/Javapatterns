public class Numpyramid {
    public static void main(String[] args) {
        int n = 5;  // Number of rows in the pyramid

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Print spaces before the numbers
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            // Print numbers in the current row
            for (int j = 1; j <= 2 * i + 1; j++) {
                // Print numbers incrementally
                if (j <= i + 1) {
                    System.out.print(j);
                } else {
                    System.out.print(2 * i + 2 - j);
                }
            }

            // Move to the next line after printing the row
            System.out.println();
        }
    }
}
