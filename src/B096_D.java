import java.util.Scanner;

public class B096_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int x = Integer.parseInt(line.split(" ")[1]);
        int y = Integer.parseInt(line.split(" ")[0]);
        int[][] matrix = new int[y][x];
        for(int i = 0; i < y; i++) {
            String[] strings = sc.nextLine().split("");
            for(int j = 0; j < strings.length; j++) {
                matrix[i][j] = strings[j].equals("#") ? 1 : 0;
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1) {
                    insertBoom(matrix, x, y, i, j);
                }
            }
        }
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 2 || matrix[i][j] == 1) count++;
            }
        }
        System.out.println(count);
    }

    private static void insertBoom(int[][] matrix, int x, int y, int i, int j) {
        for(int k = 0; k < x; k++) {
            if(matrix[i][k] == 0) matrix[i][k] = 2;
        }
        for(int m = 0; m < y; m++) {
            if(matrix[m][j] == 0) matrix[m][j] = 2;
        }
    }
}
