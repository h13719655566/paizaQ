import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C102_D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        boolean aTurn = true;
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        int aCount  = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < aCount; i++) {
            aList.add(Integer.parseInt(sc.nextLine()));
        }
        int bCount  = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < bCount; i++) {
            bList.add(Integer.parseInt(sc.nextLine()));
        }
        int[] result = new int[32];
        for(int i = 0; i < aList.size(); i++) {
            result[aList.get(i)] = 1;
        }
        for(int i = 0; i < bList.size(); i++) {
            if(result[bList.get(i)] != 0) {
                if(!aTurn) {
                    result[bList.get(i)] = 2;
                }
                aTurn = !aTurn;
            } else {
                result[bList.get(i)] = 2;
            }
        }
        for(int i = 1; i < result.length; i++) {
            switch (result[i]) {
                case 0:
                    System.out.println("x");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
            }
        }
    }
}

