import java.util.Scanner;

public class C097_D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int num1 = Integer.parseInt(input[1]);
        int num2 = Integer.parseInt(input[2]);
        for(int i = 1; i < size+1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if(i % num1 == 0) {
                stringBuilder.append("A");
            }
            if(i % num2 == 0) {
                stringBuilder.append("B");
            }
            if(i % num1 != 0 && i % num2 != 0) {
                stringBuilder.append("N");
            }
            System.out.println(stringBuilder);
            stringBuilder.setLength(0);
        }
    }
}