package project;

public class ii1 {
        public static void main(String[] args) {
            int rows = 4;
            int cols = 21;

            int[][] table = new int[rows][cols];

            int[][] ranges = {{0, 5}, {6, 9}, {10, 17}, {18, 20}};

            for (int i = 0; i < ranges.length; i++) {
                int start = ranges[i][0];
                int end = ranges[i][1];

                for (int j = start; j <= end; j++) {
                    table[i][j] = 1; // Заполнение единицами
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(table[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
