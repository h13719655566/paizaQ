import java.util.Scanner;

public class C072_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int[] status = new int[3];
        status[0] = Integer.parseInt(strings[0]);
        status[1] = Integer.parseInt(strings[1]);
        status[2] = Integer.parseInt(strings[2]);

//        System.out.println("status[0]="+status[0]);
//        System.out.println("status[1]="+status[1]);
//        System.out.println("status[2]="+status[2]);

        int role = Integer.parseInt(sc.nextLine());
        boolean isGood = false;

        for(int i = 0; i<role; i++){
            String[] optionstring = sc.nextLine().split(" ");
            int[] option = new int[6];
            String name = optionstring[0];
            option[0] = Integer.parseInt(optionstring[1]);
            option[1] = Integer.parseInt(optionstring[2]);
            option[2] = Integer.parseInt(optionstring[3]);
            option[3] = Integer.parseInt(optionstring[4]);
            option[4] = Integer.parseInt(optionstring[5]);
            option[5] = Integer.parseInt(optionstring[6]);

            if(status[0]>=option[0]&&status[0]<=option[1] && status[1]>=option[2] && status[1]<=option[3] && status[2]>=option[4] && status[2]<=option[5]){
                System.out.println(name);
                isGood=true;
            }
        }
        if(!isGood){
            System.out.println("no evolution");
        }

    }
}
