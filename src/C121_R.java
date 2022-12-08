import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C121_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int size = Integer.parseInt(string.split(" ")[0]);
        int limitCa = Integer.parseInt(string.split(" ")[1]);
        int totalCarol = 0;
        int[] rank = new int[size];
        Set<Integer> set = new HashSet<>();
        int[] carol = new int[size];
        boolean y = false;
        for(int i = 0; i<size;i++) {
            String tmp = sc.nextLine();
            rank[i] = Integer.parseInt(tmp.split(" ")[0]);
            carol[i] = Integer.parseInt(tmp.split(" ")[1]);
            totalCarol += carol[i];
            if(set.size()==10){
                System.out.println("Yes");
                y=true;
                break;
            }
            if(totalCarol>limitCa){
                System.out.println(i);
                break;
            }
            if(rank[i]<=10){
                set.add(rank[i]);
            }
        }
        if(set.size()==10&&y==false){
            System.out.println("Yes");
        }

    }
}
