import java.util.Scanner;

public class case17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();


       int r1 = n % 10;
        int r10 = n / 10;

        switch (r10){

            case 1 : System.out.print("o'n "); break;
            case 2 : System.out.print("yigirma "); break;
            case 3 : System.out.print("o'ttiz "); break;
            case 4 : System.out.print("qirq "); break;
            case 5 : System.out.print("ellik "); break;
            case 6 : System.out.print("oltmish "); break;
            case 7 : System.out.print("yetmish "); break;
            case 8 : System.out.print("sakson "); break;
            case 9 : System.out.print("to'qson "); break;
        }

        switch (r1){

            case 0: System.out.print("ta masala"); break;
            case 1: System.out.print("birta masala"); break;
            case 2: System.out.print("ikkita masala"); break;
            case 3: System.out.print("uchta masala"); break;
            case 4: System.out.print("to'rtta masala"); break;
            case 5: System.out.print("beshta masala"); break;
            case 6: System.out.print("oltita masala"); break;
            case 7: System.out.print("yetita masala"); break;
            case 8: System.out.print("sakkizta masala"); break;
            case 9: System.out.print("to'qqizta masala"); break;

        }
    }


}
