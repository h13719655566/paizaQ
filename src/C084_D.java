import java.util.Scanner;

public class C084_D {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        for(int i = 0; i < input.length() + 2; i++){
            System.out.print("+");
        }
        System.out.println();
        System.out.println("+" + input + "+");
        for(int i = 0; i < input.length() + 2; i++){
            System.out.print("+");
        }
    }
}
