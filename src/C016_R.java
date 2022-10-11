import java.util.Scanner;

public class C016_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String tmp;
        for (int i = 0; i < line.length(); i++) {

            tmp = line.split("")[i];
            if (tmp.equalsIgnoreCase("A")) {
                tmp = "4";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("4")) {
                tmp = "A";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("E")) {
                tmp = "3";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("3")) {
                tmp = "E";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("G")) {
                tmp = "6";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("6")) {
                tmp = "G";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("I")) {
                tmp = "1";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("1")) {
                tmp = "I";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("O")) {
                tmp = "0";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("0")) {
                tmp = "O";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("S")) {
                tmp = "5";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("5")) {
                tmp = "S";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("Z")) {
                tmp = "2";
                System.out.print(tmp);
                continue;
            }
            if (tmp.equalsIgnoreCase("2")) {
                tmp = "Z";
                System.out.print(tmp);
                continue;
            }
            System.out.print(tmp);

        }
    }
}
