import java.util.Scanner;

public class C099_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int paperCount = Integer.parseInt(line.split(" ")[0]);
        int nakasa = Integer.parseInt(line.split(" ")[1]);
        int totalLong = nakasa;

        for(int i = 0; i<paperCount-1; i++){
            totalLong += nakasa - Integer.parseInt(sc.nextLine());
        }
        System.out.println(totalLong*nakasa);
    }
}
