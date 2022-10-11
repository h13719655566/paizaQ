import java.util.Scanner;

public class C084_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strA ="";
        int length = str.length();

        for(int i = 0; i<length+2; i++){
            strA = strA + "+";
        }
        System.out.println(strA);
        System.out.println("+" + str + "+");
        System.out.println(strA);
    }
}
