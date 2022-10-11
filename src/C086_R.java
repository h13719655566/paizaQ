import java.util.Scanner;

public class C086_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String tmp;
        for(int i = 0; i<line.length(); i++){

            tmp = line.split("")[i];
            if(!tmp.equalsIgnoreCase("A") && !tmp.equalsIgnoreCase("E") && !tmp.equalsIgnoreCase("I") && !tmp.equalsIgnoreCase("O") && !tmp.equalsIgnoreCase("U")){

                System.out.print(tmp);
            }
        }
    }
}
