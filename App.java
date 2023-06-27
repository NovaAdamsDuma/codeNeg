
public class App {

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int m = 0; m <= grid.length - 1; m++) {
            for (int n = 0; n <= grid[m].length - 1; n++) {
                String str = grid[m][n] + "";
                if (str.contains("-")) {
                    count++;
                }
            }

        }
        return count;

    }

    public static void main(String[] args) {
        int[][] grid = { { 3, 2, 1 }, { 1, -1 } };
        System.out.println(countNegatives(grid));
    }
}