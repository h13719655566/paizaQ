import java.util.Scanner;

public class C114_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        char[] array1 = sc.nextLine().toCharArray();
        char[] array2 = sc.nextLine().toCharArray();
        for(int i = 0; i < size-2; i++) {
            if(array1[array1.length - 1] != array2[0]) {
                System.out.println(array1[array1.length - 1] + " " + array2[0]);
                return;
            }
            array1 = array2;
            array2 = sc.nextLine().toCharArray();
        }
        System.out.println("Yes");
    }
}
