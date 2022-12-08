import java.util.Scanner;

public class C023_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int size = Integer.parseInt(sc.nextLine());
        int[] atari = new int[6];
        for(int i = 0; i<6;i++){
            atari[i] = Integer.parseInt(string.split(" ")[i]);
        }

        for(int i = 0; i<size;i++){
            int count = 0;
            String str = sc.nextLine();
            for(int k = 0;k<6;k++) {
                for(int p = 0; p<6; p++) {
                    if (atari[k] == Integer.parseInt(str.split(" ")[p])) {
                        count++;
                    }
                }
                if (k == 5) {
                    System.out.println(count);
                }
            }
        }

    }
}
