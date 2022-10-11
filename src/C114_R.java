import java.util.Scanner;

public class C114_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        String[] str = new String[size];
        String downF = "";
        int count=0;
        for(int i =0; i<size;i++){
            str[i] = sc.nextLine();
            if(count != 0){
                downF = str[i].split("")[0];

                if(!downF.equals(str[i-1].split("")[str[i-1].length()-1])){
                    System.out.println(str[i-1].split("")[str[i-1].length()-1] +" "+ downF);
                    break;
                }
                if(downF.equals(str[i-1].split("")[str[i-1].length()-1])&& i == size-1){
                    System.out.println("Yes");
                }
            }
            count++;
        }
    }
}
