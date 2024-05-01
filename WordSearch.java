import java.util.*;

public class WordSearch {
    public static void main(String[] args) {
        char[][] grid = {
            {'a', 'z', 'o', 'l'},
            {'n', 'x', 'h', 'o'},
            {'v', 'y', 'i', 'v'},
            {'o', 'r', 's', 'e'}
        };

        String[] dictionary = {"van", "zoho", "love", "are", "is"};

        searchWords(grid, dictionary);
    }

    public static void searchWords(char[][] grid, String[] dictionary) {
        int rows = grid.length;
        int cols = grid[0].length;

        Set<String> wordSet = new HashSet<>(Arrays.asList(dictionary));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                StringBuilder sbRight = new StringBuilder();
                StringBuilder sbDown = new StringBuilder();

                // Search right
                for (int k = i; k < cols; k++) {
                    sbRight.append(grid[i][k]);
                    if (wordSet.contains(sbRight.toString())) {
                        System.out.println(sbRight);
                    }
                }

                // Search down
                for (int k = i; k < rows; k++) {
                    sbDown.append(grid[k][j]);
                    if (wordSet.contains(sbDown.toString())) {
                        System.out.println(sbDown);
                    }
                }
            }
        }
    }
}
