public class Twodarraycolumnsum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix[0].length; i++) {
            int columnSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                columnSum += matrix[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + ": " + columnSum);
        }
    }
}

