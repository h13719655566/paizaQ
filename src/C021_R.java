import java.util.Scanner;

public class C021_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int xc = Integer.parseInt(str[0]);
        int yc = Integer.parseInt(str[1]);
        int r_1 = Integer.parseInt(str[2]);
        int r_2 = Integer.parseInt(str[3]);
        r_1 = r_1*r_1;
        r_2 = r_2*r_2;

        int people = Integer.parseInt(sc.nextLine());
        for(int i =0; i<people; i++){
            String[] str2 = sc.nextLine().split(" ");
            int x =Integer.parseInt(str2[0]);
            int y =Integer.parseInt(str2[1]);
            x = x-xc;
            y = y-yc;
            x=x*x;
            y=y*y;
            int xy = x+y;
            if(r_1<=xy && xy<= r_2){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
