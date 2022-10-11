import java.util.Scanner;

public class C097_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int people = Integer.parseInt(line.split(" ")[0]);
        int ZoneA = Integer.parseInt(line.split(" ")[1]);
        int ZoneB = Integer.parseInt(line.split(" ")[2]);
        String result;
        for(int i =1; i < people+1; i++){
            if(i % ZoneA == 0){
                System.out.print("A");
            }
            if(i % ZoneB == 0){
                System.out.print("B");
            }
            if(i % ZoneB != 0 && i % ZoneA != 0){
                System.out.print("N");
            }
            System.out.println("");
        }
    }
}
