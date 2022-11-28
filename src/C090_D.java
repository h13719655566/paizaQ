import java.util.Scanner;

public class C090_D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int result = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '-') continue;
            if(string.charAt(i) == '0') {
                result += 12;
            } else {
                result += (int) string.charAt(i) - 46;
            }
        }
        System.out.println(result * 2);
    }
}
