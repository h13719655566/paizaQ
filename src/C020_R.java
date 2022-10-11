import java.util.Scanner;

public class C020_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int buy = Integer.parseInt(line.split(" ")[0]);
        double firstSold = Integer.parseInt(line.split(" ")[1])*0.01;
        double secondSole = Integer.parseInt(line.split(" ")[2])*0.01;
        double nogo = 0;
        double nogo2 = 0;

        nogo2 =  nogo = buy - buy*firstSold;
        nogo *= secondSole;
        nogo2 -= nogo;

        System.out.println(Math.round(nogo2 * 10000000.0) / 10000000.0);
    }
}
