import java.util.*;

import static java.lang.System.in;

public class C102_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bandA = Integer.parseInt(sc.nextLine());
        Integer[] bandAPlan = new Integer[bandA];
        String[] result = new String[31];
        for(int i = 0; i<31; i++){
            result[i] = "x";
        }
        for(int i =0; i<bandA; i++){
            bandAPlan[i] = Integer.parseInt(sc.nextLine());
        }
        int bandB = Integer.parseInt(sc.nextLine());
        Integer[] bandBPlan = new Integer[bandB];
        for(int i =0; i<bandB; i++){
            bandBPlan[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i =0; i<bandA; i++){
            result[bandAPlan[i]-1]="A";
        }
        for(int i =0; i<bandB; i++){
            result[bandBPlan[i]-1]="B";
        }
        Set<Integer> sames = getSames(bandAPlan, bandBPlan);
        boolean which = false;
        TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(sames);
        for(Object p : myTreeSet){
            int k = (int)p;
            if (which==false) {
                result[k-1]= "A";
                which = true;
                continue;
            }if(which == true){
                result[k-1] = "B";
                which = false;
            }
        }
        for(int i =0; i<31;i++){
            System.out.println(result[i]);
        }




    }
    public static Set<Integer> getSames(Integer[] a, Integer[] b) {
        Set<Integer> sames = new HashSet<Integer>();
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(a));

        for (Integer i : b) {
            if (!set.add(i))
                sames.add(i);
        }

        return sames;
    }
}
