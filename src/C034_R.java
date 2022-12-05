import java.util.Scanner;

public class C034_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] qus = new String[5];
        int indexOfx = 0;
        int x = 0;
        int a = 0;
        int b = 0;
        for(int i = 0;i<5;i++){
            qus[i]=string.split(" ")[i];
            if(qus[i]=="x"){
                indexOfx = i;
            }
        }
        String whereisX="";
        // 1 + 3 = x
        //5 -1 = x
        if(!qus[0].equals("x")){
            a = Integer.parseInt(qus[0]);
            if(qus[4].equals("x")){
                b = Integer.parseInt(qus[2]);
                whereisX = "E";
            }
            //6 - x = 3
            //2 + X = 5
            if(qus[2].equals("x")){
                b = Integer.parseInt(qus[4]);
                whereisX = "M";
            }
        }// x - 1 = 5
        // x + 3 = 7
        if(qus[0].equals("x")){
            whereisX = "F";
            a = Integer.parseInt(qus[2]);
            b = Integer.parseInt(qus[4]);
        }
        if(qus[1].equals("+")){
            switch (whereisX){
                case "F" :
                case "M" :
                    System.out.println(b-a);
                    break;
                case "E" :
                    System.out.println(a+b);
                    break;
            }
        }
        if(qus[1].equals("-")){
            switch (whereisX){
                case "F" :
                    System.out.println(a+b);
                    break;
                case "M" :
                case "E" :
                    System.out.println(a-b);
                    break;
            }
        }
    }
}
