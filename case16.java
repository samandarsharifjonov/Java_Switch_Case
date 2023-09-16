import java.util.Scanner;

public class case16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int n = scanner.nextInt();

        int r1, r10;

        r1 = n % 10;
        r10 = n / 10;


        switch (r10){

            case 1: System.out.print("o'n "); break;
            case 2: System.out.print("yigirma "); break;
            case 3: System.out.print("o'ttiz "); break;
            case 4: System.out.print("qiriq "); break;
            case 5: System.out.print("ellik "); break;
            case 6: System.out.print("oltmish "); break;
            case 7: System.out.print("yetmish "); break;
            case 8: System.out.print("sakson "); break;
            case 9: System.out.print("to'qson "); break;

        }


        switch (r1){

            case 0: System.out.print(" yosh"); break;
            case 1: System.out.print("bir yosh"); break;
            case 2: System.out.print("ikki yosh"); break;
            case 3: System.out.print("uch yosh"); break;
            case 4: System.out.print("to'rt yosh"); break;
            case 5: System.out.print("besh yosh"); break;
            case 6: System.out.print("olti yosh"); break;
            case 7: System.out.print("yetti yosh"); break;
            case 8: System.out.print("sakkiz yosh"); break;
            case 9: System.out.print("to'qqiz yosh"); break;



        }















    }
}
