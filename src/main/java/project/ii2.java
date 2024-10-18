package project;

public class ii2 {
    public static void main(String[] args) {
    int rows = 2;
    int cols = 13;
    int[][] table = new int[rows][cols];

    int[][] ranges = {
            {0, 3}, {7, 8}, {11, 12},
            {4, 6}, {9, 10}
    };

    for (int i = 0; i < ranges.length; i++) {
        int start = ranges[i][0];
        int end = ranges[i][1];

        table[i / 3][start] = 1;
        for (int j = start + 1; j <= end; j++) {
            table[i / 3][j] = 1;
        }
    }

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(table[i][j]);
        }
        System.out.println();
    }
}
}

