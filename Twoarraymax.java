public class Twoarraymax {
    public static void main(String[] args) {
        int[][] matrix = {
            {7, 2, 9},
            {4, 5, 1},
            {6, 3, 8}
        };

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Largest element: " + max);
    }
}

