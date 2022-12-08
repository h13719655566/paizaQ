import java.util.*;

public class C109_R {
    public static void main(String[] args) {
        /*
        *input:
        * tanaka1192
        * tanaka123
        * tanaka95
        *
        * output:
        * tanaka95
        * tanaka123
        * tanaka1192
        *
        * */
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        Map<Integer, String> map = new HashMap<>();
        int[] arr = new int[size];

        String[] username = new String[size];

        int number = 0;
        for(int i = 0 ; i<size; i++){
            List<Integer> list = new ArrayList<>();
            username[i] = sc.nextLine();
            char[] chars = username[i].toCharArray();
            int result = 0;
            int p = 1;
            for(char c : chars){
                if(c >= 48 && c<=57) {
                    list.add(c-48);
                    number++;
                }
            }
            for(int j = 0; j<number-1;j++){
                p=p*10;
            }
            for(int k = 0; k<list.size();k++){
                result += list.get(k)*p;
                p=p/10;
            }
            number=0;
            arr[i]=result;
            map.put(result,username[i]);
        }
        Arrays.sort(arr);
        for(int i = 0;i<size;i++){
            System.out.println(map.get(arr[i]));
        }
    }
}
